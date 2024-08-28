package it.mauluk92.music.chant.weaver.impl;

import it.mauluk92.essence.Essence;
import it.mauluk92.link.impl.EnchantedMirror;
import it.mauluk92.music.chant.impl.ChantOfTheHalls;
import it.mauluk92.music.chant.weaver.ChantWeaver;
import it.mauluk92.note.Note;
import it.mauluk92.spell.Spell;

public class NeverEndingSong implements ChantWeaver<Spell, EnchantedMirror> {

    private ChantOfTheHalls neverEndingSong;


    @Override
    public NeverEndingSong weaveChant(Note note, Spell spell) {
        var chant = new ChantOfTheHalls();
        var essence = new Essence(spell, note);
        chant.endowEssence(essence);
        this.neverEndingSong = chant;
        return this;

    }
    @Override
    public ChantOfTheHalls sing(){
        return this.neverEndingSong;
    }

    @Override
    public ChantWeaver<Spell, EnchantedMirror> nest() {
        return new NeverEndingSong();
    }
}

