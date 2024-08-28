package it.mauluk92.observer;

import it.mauluk92.link.impl.EnchantedMirror;

public interface Observer {

    void mutate(EnchantedMirror mirror);
}
