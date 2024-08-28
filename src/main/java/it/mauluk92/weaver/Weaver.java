package it.mauluk92.weaver;

import it.mauluk92.link.Link;
import it.mauluk92.monad.impl.XaqatalaPearl;

public interface Weaver<T extends Link<?>> {

    Weaver<T> weave(XaqatalaPearl<T> qalasaPearl);

    Weaver<T> weave(XaqatalaPearl<T> qalasaPearl, XaqatalaPearl<T> connectedPearl);
}
