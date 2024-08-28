package it.mauluk92.abyss.impl;

import it.mauluk92.abyss.Abyss;
import it.mauluk92.link.impl.EnchantedMirror;
import it.mauluk92.monad.impl.XaqatalaPearl;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The abyss speaks in countless voices. Each voice generate a fragment of what it exists.
 */
public class MonadCacophony implements Abyss<XaqatalaPearl<EnchantedMirror>> {


    @Override
    public Set<XaqatalaPearl<EnchantedMirror>> roar() {
        var voiceOfTheAbyss = new Random();
        return Stream
                .generate(XaqatalaPearl<EnchantedMirror>::new)
                .limit(voiceOfTheAbyss.nextLong(1,7))
                .collect(Collectors.toUnmodifiableSet());
    }
}
