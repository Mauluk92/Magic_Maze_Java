package it.mauluk92.fate.genesis;

import it.mauluk92.link.Link;
import it.mauluk92.monad.impl.XaqatalaPearl;
import it.mauluk92.music.chant.Chant;
import it.mauluk92.spell.AbstractSpell;

import java.util.List;
import java.util.Map;

/**
 * Xaqatalà, may her name be blessed seven times, dominate the formless Void through her never-ending Chant
 */
public interface Genesis<Note extends Enum<?>> {

    void chant();
    List<Note> solmization();
    Map<Note, ? extends Link<Note>> moldMirrorsOfFate();
    Map<Note, AbstractSpell> weaveSpells();
    Map<Note, ? extends XaqatalaPearl< ? extends Link<Note>>> generateFromChaos();
    Map<Note, List<Note>> generateCounterChant();
    Chant<Note> chantOfFate();
    Chant< ? extends Link<Note>> neverEndingChant(Map<Note, AbstractSpell> spells);
    Chant<? extends XaqatalaPearl<? extends Link<Note>>> weaveNet(Map<Note, List<Note>> counterMelody);
    Note setFate();
}
