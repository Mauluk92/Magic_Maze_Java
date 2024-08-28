package it.mauluk92.weaver.impl;

import it.mauluk92.link.impl.EnchantedMirror;
import it.mauluk92.monad.impl.XaqatalaPearl;
import it.mauluk92.weaver.Weaver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The net of existence. Its substance is Xaqatalà herself, may her name be blessed seven times
 */
public class XaqatalaNet implements Weaver<EnchantedMirror> {

    private final Map<XaqatalaPearl<EnchantedMirror>, List<XaqatalaPearl<EnchantedMirror>>> net = new HashMap<>();

    @Override
    public Weaver<EnchantedMirror> weave(XaqatalaPearl<EnchantedMirror> XaqatalaPearl) {
        this.net.putIfAbsent(XaqatalaPearl, new ArrayList<>());
        return this;
    }

    @Override
    public Weaver<EnchantedMirror> weave(XaqatalaPearl<EnchantedMirror> xaqatalaPearl, XaqatalaPearl<EnchantedMirror> otherXaqatalaPearl) {
        this.net.get(xaqatalaPearl).add(otherXaqatalaPearl);
        return this;
    }

    public Map<XaqatalaPearl<EnchantedMirror>, List<XaqatalaPearl<EnchantedMirror>>> getNet(){
        return this.net;
    }


}
