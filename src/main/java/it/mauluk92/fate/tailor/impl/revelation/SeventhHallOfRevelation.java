package it.mauluk92.fate.tailor.impl.revelation;

import it.mauluk92.fate.tailor.Tailor;
import it.mauluk92.fate.tailor.impl.ThreadHalls;
import it.mauluk92.music.meta.impl.SacredChant;
import it.mauluk92.note.Note;

import static it.mauluk92.note.Note.VAV;
import static it.mauluk92.note.Note.ZAYN;

public class SeventhHallOfRevelation implements Tailor<SacredChant<String, Note>> {

    private final static String SEVENTH_REVELATION = """
            Preparati ad addentrarti nel labirinto...""";


    @Override
    public SacredChant<String, Note> weaveFate() {
        return ThreadHalls.invokeThreadHalls().revealHalls().get(VAV).weaveFate().compose(ZAYN, SEVENTH_REVELATION);
    }
}
