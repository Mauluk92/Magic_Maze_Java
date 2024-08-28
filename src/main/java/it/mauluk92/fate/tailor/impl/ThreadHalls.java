package it.mauluk92.fate.tailor.impl;

import it.mauluk92.fate.tailor.Tailor;
import it.mauluk92.fate.tailor.impl.revelation.*;
import it.mauluk92.music.meta.impl.SacredChant;
import it.mauluk92.note.Note;

import java.util.Arrays;
import java.util.Map;

import static it.mauluk92.note.Note.*;

/**
 * In these halls the fate of mortals is woven.
 */
public class ThreadHalls implements Tailor<Void> {

    private static ThreadHalls THREAD_HALLS;
    private final Map<Note, Tailor<SacredChant<String, Note>>> hallsOfFate;

    private ThreadHalls(){
        this.hallsOfFate = Map.of(
                ALEPH,new FirstHallOfRevelation(),
                BET,new SecondHallOfRevelation(),
                GIMEL,new ThirdHallOfRevelation(),
                DALED,new FourthHallOfRevelation(),
                HEI,new FifthHallOfRevelation(),
                VAV,new SixthHallOfRevelation(),
                ZAYN,new SeventhHallOfRevelation()
        );
    }


    public Void weaveFate() {
        Arrays
                .stream(Note.values())
                .toList()
                .forEach(hallsOfFate.get(ZAYN)
                        .weaveFate()
                        .reveal()::tune);
        return null;
    }

    public Map<Note, Tailor<SacredChant<String, Note>>> revealHalls() {
        return this.hallsOfFate;
    }

    public static ThreadHalls invokeThreadHalls(){
        if(THREAD_HALLS == null){
            THREAD_HALLS = new ThreadHalls();
        }
        return THREAD_HALLS;
    }


}
