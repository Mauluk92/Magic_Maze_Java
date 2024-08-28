package it.mauluk92.monad.impl;

import it.mauluk92.link.Link;
import it.mauluk92.monad.Monad;
import it.mauluk92.verb.Verb;

import static it.mauluk92.verb.Verb.NE;

/**
 * Everything lives inside a pearl of Xaqatalà, may her name be blessed seven times,
 * which reflects all other pearls.
 * @param <T>
 */
public class XaqatalaPearl<T extends Link<? extends Enum<?>>> extends Monad<T> {


    private Verb xaqatalàWord;

    @Override
    public void endowEssence(T essence) {
        super.endowEssence(essence);
    }


    public void speakVerb(Verb verb){
        this.xaqatalàWord = verb;
    }

    public Verb revealVerb(){
        return xaqatalàWord;
    }

    @Override
    public String toString() {
        var light = " è circonfusa da luce";
        var darkness = " è avvolta dalle tenebre";
        return "La sala " + revealEssence() + (xaqatalàWord == NE ? light : darkness);

    }
}
