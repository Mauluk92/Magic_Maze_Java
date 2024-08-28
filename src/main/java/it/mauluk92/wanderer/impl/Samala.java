package it.mauluk92.wanderer.impl;

import it.mauluk92.link.impl.EnchantedMirror;
import it.mauluk92.monad.impl.XaqatalaPearl;
import it.mauluk92.observer.impl.Xaqatala;
import it.mauluk92.spell.impl.Rest;
import it.mauluk92.verb.Verb;
import it.mauluk92.wanderer.Wanderer;
import it.mauluk92.wanderer.bud.Bud;
import it.mauluk92.wanderer.soul.SoulState;

import java.util.Arrays;

import static it.mauluk92.verb.Verb.NE;
import static it.mauluk92.verb.Verb.QY;
import static it.mauluk92.wanderer.soul.SoulState.CORRUPTED_STATE;
import static it.mauluk92.wanderer.soul.SoulState.PURIFIED_STATE;

/**
 * Samalà was once a powerful wizard that came from the kingdom of stars, a plane of existence really close
 * to the Void plane, which embrace everything.
 */
public class Samala implements Wanderer<EnchantedMirror> {

    private static Samala rose;
    private final Bud bud = Bud.blossom();
    private SoulState purifiedState;

    private Samala(SoulState purifiedState){
        this.purifiedState = purifiedState;
    }

    @Override
    public void wander(XaqatalaPearl<EnchantedMirror> xaqatalaPearl) {

        System.out.println(xaqatalaPearl);
        wander(xaqatalaPearl.revealEssence());
        var paths = Xaqatala
                .invokeXaqatala()
                .unfoldNet()
                .getNet()
                .get(xaqatalaPearl);
        var choice = bud.unfold(paths.listIterator());
        if(paths.get(choice).revealEssence().revealSpell().trace()){
            wander(paths.get(choice));
        }else{
            System.out.println("Le tenebre non permettono di accedere a quest'ala del labirinto");
            wander(xaqatalaPearl);
        }

    }

    public Bud revealBud(){
        return this.bud;
    }

    @Override
    public void wander(EnchantedMirror mirror) {
        System.out.println(mirror.revealSpell());
        if(mirror.revealSpell() instanceof Rest){
            switch (bud.unfold(Arrays.stream(Verb.values()).toList().listIterator())){
                case 0 -> ((Rest) mirror.revealSpell()).endowVerb(NE);
                case 1 -> ((Rest) mirror.revealSpell()).endowVerb(QY);
            }

        }
        mirror.propagate();

    }
    public static Samala getSoul() {
        if (rose == null) {
            rose = new Samala(CORRUPTED_STATE);
        }
        return rose;
    }

    public void purify(){
        System.out.println("-".repeat(7));
        System.out.println("""
                Nell'incontrare lo sguardo di Xaqatalà, riconosci il dispiegarsi di ogni cosa,
                uno sguardo dolce e abissale come la mezzanotte d'un cielo senza stelle.
                L'ultima cosa che ricordi è il sorriso di pace nel comprendere ogni cosa al suo
                dissolversi
                """);
        System.out.println("-".repeat(7));
        this.purifiedState = PURIFIED_STATE;
    }

    public SoulState judge(){
        return purifiedState;
    }
}