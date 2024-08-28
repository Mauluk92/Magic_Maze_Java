package it.mauluk92.fate.tailor.impl.revelation;

import it.mauluk92.fate.tailor.Tailor;
import it.mauluk92.fate.tailor.impl.ThreadHalls;
import it.mauluk92.music.meta.impl.SacredChant;
import it.mauluk92.note.Note;

import static it.mauluk92.note.Note.ALEPH;
import static it.mauluk92.note.Note.BET;

public class SecondHallOfRevelation implements Tailor<SacredChant<String, Note>> {

    private final static String SECOND_REVELATION = """
            In principio era solo il caos ruggente di Millevoci dell'Abisso.
            Una cacofonia priva di senso e ordine, il vorticare ignoto
            degli elementi.
            Ma con il mio Canto ho domato il mare in tempesta del Vuoto.
            Dando forma al senza-forma...
            """;

    @Override
    public SacredChant<String, Note> weaveFate() {
        return ThreadHalls.invokeThreadHalls().revealHalls().get(ALEPH).weaveFate().compose(BET, SECOND_REVELATION);
    }
}
