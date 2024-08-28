package it.mauluk92.music.chant.weaver;

import it.mauluk92.music.chant.Chant;
import it.mauluk92.note.Note;

/**
 * A Chant bind something with a note and commands its existence
 * @param <T>
 */
public interface ChantWeaver<T,B> {


    ChantWeaver<T, B> weaveChant(Note note, T score);

    Chant<B> sing();

    ChantWeaver<T,B> nest();
}

