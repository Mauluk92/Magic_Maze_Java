package it.mauluk92.music.meta.impl;

import it.mauluk92.music.chant.Chant;
import it.mauluk92.music.chant.weaver.ChantWeaver;
import it.mauluk92.music.meta.MetaChant;
import it.mauluk92.note.Note;

import java.util.ArrayList;
import java.util.List;

/**
 * The Sacred Chant of Xaqatalà, may she be blessed seven times, through which everything is shaped into existence
 * @param <T>
 * @param <B>
 */
public class SacredChant<T,B> implements MetaChant<T,B> {

    private List<ChantWeaver<T,B>> metaChant;

    private final ChantWeaver<T,B> chantWeaver;

    public SacredChant(ChantWeaver<T,B> chantWeaver){
        this.metaChant = new ArrayList<>();
        this.chantWeaver = chantWeaver;
    }

    @Override
    public SacredChant<T, B> compose(Note note, T score) {
        var song = chantWeaver.nest();
        song.weaveChant(note, score);
        metaChant.add(song);
        return this;
    }

    public Chant<B> reveal(){
        return recursiveChant();
    }


    public Chant<B> recursiveChant() {
        var nestedChants = this.metaChant.stream().map(ChantWeaver::sing).toList();
        if (nestedChants.size() == 1) {
            return nestedChants.get(0);
        }
        nestedChants.get(nestedChants.size() - 2).compose(nestedChants.get(nestedChants.size() - 1));
        this.metaChant = this.metaChant.subList(0, nestedChants.size() - 1);
        return recursiveChant();
    }
}
