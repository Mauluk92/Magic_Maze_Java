package it.mauluk92.wanderer;

import it.mauluk92.link.Link;
import it.mauluk92.monad.impl.XaqatalaPearl;

/** This spell makes it possible for the wizard to navigate through different worlds and planes of existence,
 * while keeping always a sense of direction. In a sense, it's like a compass.
 */
public interface Wanderer<T extends Link<? extends Enum<?>>> {

    void wander(XaqatalaPearl<T> xaqatalaPearl);

    void wander(T nodeOfExistence);
}
