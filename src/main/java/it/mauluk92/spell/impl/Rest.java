package it.mauluk92.spell.impl;

import it.mauluk92.spell.AbstractSpell;
import it.mauluk92.verb.Verb;

public class Rest extends AbstractSpell {

    private Word commandWord;

    @Override
    public Boolean trace() {
        return true;
    }

    public void endowWord(Word word){
        this.commandWord = word;
    }
    public void endowVerb(Verb verb){
        commandWord.endowVerb(verb);
    }

    @Override
    public String toString() {
        return "La sala contiene il sigillo " + commandWord.toString() + " con la parola " + commandWord.revealVerb();
    }
}
