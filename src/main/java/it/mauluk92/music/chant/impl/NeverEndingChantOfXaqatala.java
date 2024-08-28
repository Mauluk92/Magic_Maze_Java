package it.mauluk92.music.chant.impl;

import it.mauluk92.link.impl.EnchantedMirror;
import it.mauluk92.monad.impl.XaqatalaPearl;
import it.mauluk92.music.chant.Chant;
import it.mauluk92.note.Note;
import it.mauluk92.observer.impl.Xaqatala;

import java.util.List;

/**
 * The net of Xaqatalà, may her name be blessed seven times, is sung eternally through Her voice
 */
public class NeverEndingChantOfXaqatala implements Chant<XaqatalaPearl<EnchantedMirror>> {

    private Chant<XaqatalaPearl<EnchantedMirror>> song;
    private List<Note> counterMelody;
    private Note note;

    @Override
    public void tune(XaqatalaPearl<EnchantedMirror> scoreOfFate) {
        if(note == scoreOfFate.revealEssence().revealEssence()){
            Xaqatala.invokeXaqatala()
                    .unfoldNet()
                    .getNet()
                    .keySet()
                    .stream()
                    .filter((xaqatalaPearl -> counterMelody
                            .contains(xaqatalaPearl
                                    .revealEssence()
                                    .revealEssence()
                            )))
                    .forEach((xaqatalaPearl -> Xaqatala
                            .invokeXaqatala()
                            .unfoldNet()
                            .weave(scoreOfFate, xaqatalaPearl)));
        }else{
            sing(scoreOfFate);
        }
    }

    @Override
    public void sing(XaqatalaPearl<EnchantedMirror> scoreOfFate) {
        if(this.song != null) {
            song.tune(scoreOfFate);
        }
    }
    @Override
    public void compose(Chant<XaqatalaPearl<EnchantedMirror>> chant){
        this.song = chant;
    }

    public void endowNote(Note note){
        this.note = note;
    }

    public void tuneWeavingSong(List<Note> counterMelody) {
        this.counterMelody = counterMelody;
    }
}

