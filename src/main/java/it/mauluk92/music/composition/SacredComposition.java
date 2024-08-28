package it.mauluk92.music.composition;

import it.mauluk92.note.Note;

import java.util.List;

@FunctionalInterface
public interface SacredComposition {

    SacredComposition compose(Note note, List<Note> counterMelody);
}
