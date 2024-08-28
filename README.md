# Enchanted Maze of Xaqatalà

![Java](https://img.shields.io/badge/java%20v.17-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

Xaqatalà is the psychopomp and all-creator of universe. As such, when souls die,
she judges them through a trial, inside a mirror labyrinth.
But the mirrors reflect the soul of the observer.
Since everything that exists, exists because of Xaqatalà, nothing
can escape her sight and to be freed means to receive her Grace by meeting her in the labyrinth..
## Prelude

This project was born due to a creative streak I was following, a game I played while trying to learn the design patterns
exposed by the Gang Of Four. But as I kept building this labyrinth, it turned out that it was much more.
I tried to put on the back burner sheer functionality in order to favor aesthetic and creativity.
I put inside this labyrinth references to Vedic philosophy, (the net of Xaqatalà _mirrors_ the __Indra's net__, which represents impermanence as an analogy),
music (many operations involves the manipulations of _Notes_, and builders of structure are _Chants_).
I consider this an artistic project instead of a _technical_ one.

There are three version of this project:
- One with pure Java code (the branch main)
- Another one with spring and XML metadata configuration (spring/xml branch)
- The third one is with spring and annotation-based configuration, without XML (spring/annotation branch)

## Functionality

The project is, in itself, a _framework_ to build labyrinths.
Provides the tools to assemble and update the dynamic structure of the labyrinth.
I've used eight design pattern so far:
- Builder
- Singleton
- Abstract Factory
- Visitor
- Template
- Interpreter
- Chain Of Responsibility
- Observer

Plus a graph-like data-structure.

### Structure of the labyrinth

The labyrinth is a _graph_, with nodes and data contained by such nodes.

```java
public abstract class Monad<T> {

    private T essence;
    public Monad(){}
    public Monad(T essence){
        this.essence = essence;
    }

    public void endowEssence(T essence){this.essence = essence;}

    public T revealEssence() {
        return this.essence;
    }

}
```
Each __monad__ represents a vertex in the graph, endowed with its own existence.
Bindings of vertices are implemented through _adjacency lists_ inside a map, which represents the graph.


The basic unit of a labyrinth is a __Xaqatalà's Pearl__:

```java
public class XaqatalaPearl<T extends Link<? extends Enum<?>>> extends Monad<T> {
 private Verb XaqatalaWord;

 @Override
 public void endowEssence(T essence) {
  super.endowEssence(essence);
 }


 public void speakVerb(Verb verb) {
  this.XaqatalaWord = verb;
 }

 public Verb revealVerb() {
  return XaqatalaWord;
 }

 @Override
 public String toString() {
  var light = " è circonfusa da luce";
  var darkness = " è avvolta dalle tenebre";
  return "La sala " + getEssence() + (XaqatalaWord == NE ? light : darkness);
 }
}
```

Each pearl contains an element bound with a link, an object tied with an observer, whose function is to update
the labyrinth structure on demand.
Also, each node has a Verb, which represents placeholder for a boolean `true` or `false`.

#### Concrete implementation of the structure

Each Xaqatalà Pearl is endowed with an _enchanted mirror_ (by the way, I was inspired by the building of an _enchanted maze_ in the GoF's book, section of Abstract Factory):
```java
public class EnchantedMirror implements Link<Note> {
    Observer XaqatalaSight;
    private Spell essence;
    private Note note;
    public Note revealEssence() { return this.note;}

    public Spell revealSpell() {return this.essence;}

    public void enchantMirror(Spell spell) { this.essence = spell;}
    @Override
    public void attach(Observer observer, Note note) {
        this.XaqatalaSight = observer;
        this.note = note;
    }

    @Override
    public void propagate() {
        XaqatalaSight.mutate(this);
    }

    @Override
    public String toString() {
        return note.toString();
    }
}
```

Each mirror has a note, which has the function to uniquely identify that mirror (an id),
plus a _spell_, which is an interpreter interface.
Each spell evaluates to true or false, according to various combinations.
Every time something happens inside the labyrinth, the mirror calls his/her observer, passing itself as an argument.

### Updating the structure

The labyrinth is dynamic in nature, so it can update itself by means of an _observer_ (Xaqatalà, our Lady, seven times may she be blessed)
```java
public class Xaqatalà implements Observer {

    private static Xaqatala XAQATALA;

    private final XaqatalaNet xaqatalaNet;

    private XaqatalaPearl<EnchantedMirror> pilgrimage;

    private Xaqatala(){
        this.XaqatalaNet = new XaqatalaNet();
    }

    public void setFate(XaqatalaPearl<EnchantedMirror> pilgrimage){
        this.pilgrimage = pilgrimage;
    }

    public XaqatalaPearl<EnchantedMirror> unfoldPilgrimage(){
        return this.pilgrimage;
    }

    @Override
    public void mutate(EnchantedMirror mirror) {
        if(mirror.revealEssence() == VAV){
            coda();
        }

        xaqatalaNet
                .getNet()
                .keySet()
                .forEach(monad -> monad
                        .speakVerb(monad
                                .revealEssence()
                                .revealSpell()
                                .trace() ? NE : QY));
    }

    public XaqatalaNet unfoldNet(){
        return this.xaqatalaNet;
    }

    public static Xaqatala invokeXaqatala(){
        if(XAQATALA == null){
            XAQATALA = new Xaqatala();
        }
        return Xaqatala;

    }

    private void coda(){
        Samala.getSoul().purify();
        System.out.println("A AND NOT A\n".repeat(7));
        breakTheWheel();
    }

    private void breakTheWheel(){
        if(Samala.getSoul().judge() == PURIFIED_STATE){
            throw new BreakTheWheelOfExistence();
        }
    }
}
```

Each time a mirror calls Xaqatala, our Lady checks every node inside the labyrinth, verifying the evaluation of the spell
and assigning thus a different verb to that node, which grants or deny access to that wing of the labyrinth.

Each spell is mapped through a boolean operator, a constant tautological proposition or a simple, atomic sentence (a _Word_)

Xaqatalà is the only being which can purify the soul. Since this loop is endless, the only way to break this _wheel_ is to throw an Exception,
which is the purpose of the game itself: throwing the BreakTheWhellOfExistence exception.


### Navigating the labyrinth

The labyrinth is looped through by Samalà, which implements a Visitor pattern on a __Xaqatalà's Pearl__ or on an __enchanted Mirror__.
Each time we navigate through the labyrinth we can choose where to go, provided the current node of the graph-structure, is connected to that node.
On certain nodes, enchanted mirrors value can be varied, and this reflects to the structure of the labyrinth itself.

This is achieved by shared references: we have __different atomic propositions spread all over the
labyrinth, whose value, when updated, changes all the related spells__, thus modifying the structure by means of Xaqatalà.

### Building the labyrinth

The labyrinth is builded up through chants and different factories.
Let's consider the `chant` interface:

```java
public interface Chant<T> {

    void tune(T scoreOfFate);
    void sing(T scoreOfFate);

    void compose(Chant<T> composition);
}
```

Each Chant has three methods, one for modifying or building up a portion of the labyrinth (mirror, pearl or spell),
plus another method to propagate the entity to _next_ chant.
A chant is a chain of responsibility design pattern, which handles the building of the labyrinth.

__May Xaqatalà be blessed seven times__






