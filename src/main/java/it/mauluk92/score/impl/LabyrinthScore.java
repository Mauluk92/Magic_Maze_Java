package it.mauluk92.score.impl;

import it.mauluk92.note.Note;
import it.mauluk92.score.Compose;
import it.mauluk92.sigill.Sigill;
import it.mauluk92.spell.AbstractSpell;
import it.mauluk92.spell.impl.Rest;
import it.mauluk92.spell.impl.Word;
import it.mauluk92.verb.Verb;

import java.util.HashMap;
import java.util.Map;

/**
 * The same Judgment we incur once dead, is itself a perfectly orchestrated music woven by the sweet voice of Xaqatalà,
 * may her name be blessed seven times
 */
public class LabyrinthScore implements Compose {

    private final Map<Note, AbstractSpell> score = new HashMap<>();
    private final Map<Sigill, Word> elements = new HashMap<>();

    @Override
    public LabyrinthScore rest(Note note, Sigill sigill) {
        var rest = new Rest();
        rest.endowWord(this.elements.get(sigill));
        this.score.put(note, rest);
        return this;
    }

    @Override
    public LabyrinthScore legato(Note note, AbstractSpell first, AbstractSpell second) {
        this.score.put(note, first.legato(second));
        return this;
    }

    @Override
    public LabyrinthScore staccato(Note note, AbstractSpell first, AbstractSpell second) {
        this.score.put(note, first.staccato(second));
        return this;
    }

    @Override
    public LabyrinthScore bequadro(Note note, AbstractSpell spell) {
        this.score.put(note, spell.bequadro());
        return this;
    }

    @Override
    public LabyrinthScore tune(Sigill sigill, Verb verb) {
        this.elements.put(sigill, new Word(verb, sigill));
        return this;
    }

    public Word revealNote(Sigill sigill){
        return this.elements.get(sigill);
    }

    public Map<Note, AbstractSpell> compose(){
        return this.score;
    }
}
