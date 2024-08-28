package it.mauluk92.fate.tailor.impl.revelation;

import it.mauluk92.fate.tailor.Tailor;
import it.mauluk92.music.chant.weaver.impl.NeverEndingChantOfFate;
import it.mauluk92.music.meta.impl.SacredChant;
import it.mauluk92.note.Note;

import static it.mauluk92.note.Note.ALEPH;

public class FirstHallOfRevelation implements Tailor<SacredChant<String, Note>> {

    private final static String FIRST_REVELATION = """
            Samalà della corte delle stelle, la tua rosa ha rintoccato l'ultima nota..
            Io sono Xaqatalà, la Signora dei mondi, ho fabbricato questa realtà dal nulla del caos..
            """;

    @Override
    public SacredChant<String,Note> weaveFate() {
        return new SacredChant<>(new NeverEndingChantOfFate()).compose(ALEPH, FIRST_REVELATION);
    }
}
