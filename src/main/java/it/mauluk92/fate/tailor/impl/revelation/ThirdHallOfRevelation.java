package it.mauluk92.fate.tailor.impl.revelation;

import it.mauluk92.fate.tailor.Tailor;
import it.mauluk92.fate.tailor.impl.ThreadHalls;
import it.mauluk92.music.meta.impl.SacredChant;
import it.mauluk92.note.Note;

import static it.mauluk92.note.Note.BET;
import static it.mauluk92.note.Note.GIMEL;

public class ThirdHallOfRevelation implements Tailor<SacredChant<String, Note>> {

    private final static String THIRD_REVELATION = """
            Samalà Della Corte delle stelle, quel che spetta alle anime
            che hanno abbandonato la loro veste corporea è il Giudizio,
            ...""";




    @Override
    public SacredChant<String, Note> weaveFate() {
        return ThreadHalls.invokeThreadHalls().revealHalls().get(BET).weaveFate().compose(GIMEL, THIRD_REVELATION);
    }
}
