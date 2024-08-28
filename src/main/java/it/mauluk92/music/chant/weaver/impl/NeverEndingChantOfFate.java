package it.mauluk92.music.chant.weaver.impl;

import it.mauluk92.music.chant.impl.ThreadOfFate;
import it.mauluk92.music.chant.weaver.ChantWeaver;
import it.mauluk92.note.Note;

public class NeverEndingChantOfFate implements ChantWeaver<String, Note> {

    private final ThreadOfFate silverThread;

    public NeverEndingChantOfFate(){
        this.silverThread = new ThreadOfFate();
    }

    @Override
    public NeverEndingChantOfFate weaveChant(Note note, String score) {
        silverThread.endowNote(note);
        silverThread.writeRevelation(score);
        return this;
    }
    @Override
    public ThreadOfFate sing(){
        return this.silverThread;
    }

    @Override
    public ChantWeaver<String, Note> nest() {
        return new NeverEndingChantOfFate();
    }
}

