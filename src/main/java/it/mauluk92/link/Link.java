package it.mauluk92.link;

import it.mauluk92.observer.Observer;

/**
 * Each and everything is connected under the sight of Xaqatala,
 * may her name be blessed seven times
 */
public interface Link<N extends Enum<?>> {

    void attach(Observer observer, N note);
    void propagate();
}
