package it.mauluk92.score;

import it.mauluk92.note.Note;
import it.mauluk92.sigill.Sigill;
import it.mauluk92.spell.AbstractSpell;
import it.mauluk92.verb.Verb;

/**
 * As for all things, to compose means to separate and chain, giving order to chaos
 */
public interface Compose {

    Compose rest(Note note, Sigill sigill);
    Compose legato(Note note,AbstractSpell first, AbstractSpell second);
    Compose staccato(Note note,AbstractSpell first, AbstractSpell second);
    Compose bequadro(Note note, AbstractSpell spell);

    Compose tune(Sigill sigill, Verb verb);
}
