package it.mauluk92.spell.impl;

import it.mauluk92.spell.SimpleSpell;
import it.mauluk92.spell.Spell;

public class Bequadro extends SimpleSpell {

    public Bequadro(Spell spell){
        super(spell);
    }

    @Override
    public Boolean trace() {
        return !getSpell().trace();
    }

    @Override
    public String toString() {
        return "NOT (" + super.getSpell().toString() + ")";
    }
}
