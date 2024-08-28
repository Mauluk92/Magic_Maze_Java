package it.mauluk92.observer.impl;

import it.mauluk92.link.impl.EnchantedMirror;
import it.mauluk92.monad.impl.XaqatalaPearl;
import it.mauluk92.observer.Observer;
import it.mauluk92.purification.BreakTheWheelOfExistence;
import it.mauluk92.wanderer.impl.Samala;
import it.mauluk92.weaver.impl.XaqatalaNet;

import static it.mauluk92.note.Note.VAV;
import static it.mauluk92.verb.Verb.NE;
import static it.mauluk92.verb.Verb.QY;
import static it.mauluk92.wanderer.soul.SoulState.PURIFIED_STATE;

/**
 * Our Lady, whose unfathomable beauty is like the squaring of a circle, which holds everything inside her net
 * and orchestrate the life of mortals.
 */

public class Xaqatala implements Observer {

    private static Xaqatala XAQATALA;

    private final XaqatalaNet xaqatalaNet;

    private XaqatalaPearl<EnchantedMirror> pilgrimage;

    private Xaqatala() {
        this.xaqatalaNet = new XaqatalaNet();
    }

    public void setFate(XaqatalaPearl<EnchantedMirror> pilgrimage) {
        this.pilgrimage = pilgrimage;
    }

    public XaqatalaPearl<EnchantedMirror> unfoldPilgrimage() {
        return this.pilgrimage;
    }

    @Override
    public void mutate(EnchantedMirror mirror) {
        if (mirror.revealEssence() == VAV) {
            coda();
        }

        xaqatalaNet
                .getNet()
                .keySet()
                .forEach(monad -> monad
                        .speakVerb(monad
                                .revealEssence()
                                .revealSpell()
                                .trace() ? NE : QY));
    }

    public XaqatalaNet unfoldNet() {
        return this.xaqatalaNet;
    }

    public static Xaqatala invokeXaqatala() {
        if (XAQATALA == null) {
            XAQATALA = new Xaqatala();
        }
        return XAQATALA;

    }

    private void coda() {
        Samala.getSoul().purify();
        System.out.println("A AND NOT A\n".repeat(7));
        breakTheWheel();
    }

    private void breakTheWheel() {
        if (Samala.getSoul().judge() == PURIFIED_STATE) {
            throw new BreakTheWheelOfExistence();
        }
    }
}
