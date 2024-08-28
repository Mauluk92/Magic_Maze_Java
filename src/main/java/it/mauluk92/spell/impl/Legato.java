package it.mauluk92.spell.impl;

import it.mauluk92.spell.CompositeSpell;
import it.mauluk92.spell.Spell;

import java.util.List;
import java.util.stream.Collectors;

public class Legato extends CompositeSpell {

    public Legato(List<Spell> spells) {
        super(spells);
    }

    @Override
    public Boolean trace() {
        return this.getSpells()
                .stream()
                .map(Spell::trace)
                .reduce(Boolean::logicalAnd)
                .orElse(false);
    }

    @Override
    public String toString() {
        return "(" +
                super.getSpells()
                        .stream()
                        .map(Spell::toString)
                        .collect(Collectors.joining(" AND ")) +
                ")";
    }
}
