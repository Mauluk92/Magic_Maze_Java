package it.mauluk92;

import it.mauluk92.fate.genesis.impl.SilverPalace;
import it.mauluk92.observer.impl.Xaqatala;
import it.mauluk92.wanderer.impl.Samala;

/**
 * This is the circle of birth, death and rebirth each soul has to go through in order to be purified
 */
public class WheelOfExistence {
    public static void main(String[] args) {
        SilverPalace.fromVoid().chant();
        Samala.getSoul().wander(Xaqatala.invokeXaqatala().unfoldPilgrimage());
    }
}