package it.mauluk92.music.meta;

import it.mauluk92.note.Note;

@FunctionalInterface
public interface MetaChant<T, B> {

    MetaChant<T, B> compose(Note note, T score);

}
