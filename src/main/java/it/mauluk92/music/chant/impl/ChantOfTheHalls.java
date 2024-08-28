package it.mauluk92.music.chant.impl;

import it.mauluk92.essence.Essence;
import it.mauluk92.link.impl.EnchantedMirror;
import it.mauluk92.music.chant.Chant;

/**
 * Each object which appears to be real, is itself the music of Xaqatalà, may her name be blessed.
 * Everything reflect Her because we live in her.
 */
public class ChantOfTheHalls implements Chant<EnchantedMirror> {

    private Essence essence;
    private Chant<EnchantedMirror> song;

    @Override
    public void tune(EnchantedMirror scoreOfFate) {
        if(scoreOfFate.revealEssence() == essence.note()) {
            scoreOfFate.enchantMirror(essence.spell());
        }else{
            sing(scoreOfFate);
        }
    }

    public void endowEssence(Essence essence){
        this.essence = essence;
    }

    @Override
    public void sing(EnchantedMirror scoreOfFate) {
        if(song != null){
            song.tune(scoreOfFate);
        }
    }

    @Override
    public void compose(Chant<EnchantedMirror> compositionOfFate) {
        this.song = compositionOfFate;
    }
}
