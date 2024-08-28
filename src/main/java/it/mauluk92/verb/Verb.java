package it.mauluk92.verb;

/**
 * A verb represent one of the two polar forces in the universe: they have many names,
 * Love/Hate, Creation/Destruction, Attraction/Repulsion, but they all mean the same thing.
 */
public enum Verb {

    NE("Vita"),
    QY("Morte");

    private final String value;

    Verb(String value){
        this.value = value;
    }


    @Override
    public String toString() {
        return this.value;
    }
}