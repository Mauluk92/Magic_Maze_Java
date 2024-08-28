package it.mauluk92.music.chant.weaver.impl;

import it.mauluk92.link.impl.EnchantedMirror;
import it.mauluk92.monad.impl.XaqatalaPearl;
import it.mauluk92.music.chant.impl.NeverEndingChantOfXaqatala;
import it.mauluk92.music.chant.weaver.ChantWeaver;
import it.mauluk92.note.Note;

import java.util.List;

public class NeverEndingChantOfGenesis implements ChantWeaver<List<Note>, XaqatalaPearl<EnchantedMirror>> {

    private final NeverEndingChantOfXaqatala neverEndingSong;


    public NeverEndingChantOfGenesis(){
        this.neverEndingSong = new NeverEndingChantOfXaqatala();
    }
    @Override
    public NeverEndingChantOfGenesis weaveChant(Note note, List<Note> weavingChant) {
        neverEndingSong.tuneWeavingSong(weavingChant);
        neverEndingSong.endowNote(note);
        return this;
    }
    @Override
    public NeverEndingChantOfXaqatala sing(){
        return this.neverEndingSong;
    }

    @Override
    public ChantWeaver<List<Note>, XaqatalaPearl<EnchantedMirror>> nest() {
        return new NeverEndingChantOfGenesis();
    }
}

