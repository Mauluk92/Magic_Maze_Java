package it.mauluk92.music.composition.impl;

import it.mauluk92.music.composition.SacredComposition;
import it.mauluk92.note.Note;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * It is told that the fate of mortals is written in scores, whose music is their life
 */
public class SacredScore implements SacredComposition {

    private final Map<Note, List<Note>> score = new HashMap<>();

    @Override
    public SacredScore compose(Note note, List<Note> counterMelody) {
        score.putIfAbsent(note, counterMelody);
        return this;
    }

    public Map<Note, List<Note>> revealSacredScore(){
        return this.score;
    }
}
