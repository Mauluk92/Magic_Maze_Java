package it.mauluk92.fate.tailor.impl.revelation;

import it.mauluk92.fate.tailor.Tailor;
import it.mauluk92.fate.tailor.impl.ThreadHalls;
import it.mauluk92.music.meta.impl.SacredChant;
import it.mauluk92.note.Note;

import static it.mauluk92.note.Note.DALED;
import static it.mauluk92.note.Note.GIMEL;

public class FourthHallOfRevelation implements Tailor<SacredChant<String, Note>> {


    private final static String FOURTH_REVELATION = """
            Dovrai vagare per le mie sale per incontrarmi. Se non riuscirai,
            la pena sarà vagare di nuovo affinché tu sia purificato dalle pene passate.
            Le mie sale sono specchi che riflettono l'animo di chi le osserva
            """;

    @Override
    public SacredChant<String,Note> weaveFate() {
        return ThreadHalls.invokeThreadHalls().revealHalls().get(GIMEL).weaveFate().compose(DALED, FOURTH_REVELATION);
    }
}
