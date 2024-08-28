package it.mauluk92.fate.tailor.impl.revelation;

import it.mauluk92.fate.tailor.Tailor;
import it.mauluk92.fate.tailor.impl.ThreadHalls;
import it.mauluk92.music.meta.impl.SacredChant;
import it.mauluk92.note.Note;

import static it.mauluk92.note.Note.DALED;
import static it.mauluk92.note.Note.HEI;

public class FifthHallOfRevelation implements Tailor<SacredChant<String, Note>> {

    private final static String FIFTH_REVELATION = """
            Nel mondo esistono due sole forze, l'Amore e l'Odio, la Vita e la Morte.
            Chiunque voglia raggiungermi deve usare entrambe poiché L'Amore senza odio è privo di forza,
            e l'Odio privo di amore è cieco e senza direzione...
            Se saprai imbrigliarle, potrai navigare il labirinto e incontrarmi, muovendo ogni cosa
            a tua volontà, poiché Tutto è in Me, ed io sono in Ogni cosa
            """;

    @Override
    public SacredChant<String,Note> weaveFate() {
        return ThreadHalls.invokeThreadHalls().revealHalls().get(DALED).weaveFate().compose(HEI, FIFTH_REVELATION);
    }
}
