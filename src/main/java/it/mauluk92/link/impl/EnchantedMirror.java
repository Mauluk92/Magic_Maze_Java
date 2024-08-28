package it.mauluk92.link.impl;

import it.mauluk92.link.Link;
import it.mauluk92.note.Note;
import it.mauluk92.observer.Observer;
import it.mauluk92.spell.Spell;

public class EnchantedMirror implements Link<Note> {

    private Observer qalasaSight;
    private Spell essence;
    private Note note;
    public Note revealEssence() { return this.note;}

    public Spell revealSpell() {return this.essence;}

    public void enchantMirror(Spell spell) { this.essence = spell;}

    @Override
    public void attach(Observer observer, Note note) {
        this.qalasaSight = observer;
        this.note = note;
    }

    @Override
    public void propagate() {
        qalasaSight.mutate(this);
    }

    @Override
    public String toString() {
        return note.toString();
    }
}
