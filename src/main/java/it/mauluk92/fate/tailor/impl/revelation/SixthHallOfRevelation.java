package it.mauluk92.fate.tailor.impl.revelation;

import it.mauluk92.fate.tailor.Tailor;
import it.mauluk92.fate.tailor.impl.ThreadHalls;
import it.mauluk92.music.meta.impl.SacredChant;
import it.mauluk92.note.Note;

import static it.mauluk92.note.Note.HEI;
import static it.mauluk92.note.Note.VAV;

public class SixthHallOfRevelation implements Tailor<SacredChant<String, Note>> {

    private final static String SIXTH_REVELATION = """
            Tutto infatti è intessuto in questa Rete infinita,
            che abbraccia ogni cosa e si allarga perennemente.
            Chiunque veda dentro se stesso può alterare questa rete,
            solo sussurrando il mio nome nel pensiero.
            Perché ciò che viene chiesto con la fede, io lo 
            concedo..
            """;


    @Override
    public SacredChant<String, Note> weaveFate() {
        return ThreadHalls.invokeThreadHalls().revealHalls().get(HEI).weaveFate().compose(VAV, SIXTH_REVELATION);
    }
}
