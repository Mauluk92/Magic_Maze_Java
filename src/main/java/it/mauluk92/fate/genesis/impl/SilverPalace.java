package it.mauluk92.fate.genesis.impl;

import it.mauluk92.abyss.impl.ManyVoiceFromTheAbyss;
import it.mauluk92.fate.genesis.Genesis;
import it.mauluk92.fate.tailor.impl.ThreadHalls;
import it.mauluk92.link.impl.EnchantedMirror;
import it.mauluk92.monad.impl.XaqatalaPearl;
import it.mauluk92.music.chant.Chant;
import it.mauluk92.music.chant.weaver.impl.NeverEndingChantOfGenesis;
import it.mauluk92.music.chant.weaver.impl.NeverEndingSong;
import it.mauluk92.music.composition.impl.SacredScore;
import it.mauluk92.music.meta.impl.SacredChant;
import it.mauluk92.note.Note;
import it.mauluk92.observer.impl.Xaqatala;
import it.mauluk92.score.impl.LabyrinthScore;
import it.mauluk92.spell.AbstractSpell;
import it.mauluk92.spell.Spell;

import java.util.*;
import java.util.stream.Stream;

import static it.mauluk92.note.Note.*;
import static it.mauluk92.sigill.Sigill.A;
import static it.mauluk92.sigill.Sigill.B;
import static it.mauluk92.verb.Verb.NE;
import static it.mauluk92.verb.Verb.QY;

/**
 * This is the middle of planes, whose center is everywhere, and its circumference nowhere to be found.
 * Here, the souls comes to receive their due under the sight of Xaqatalà, may her name be blessed seven times.
 */
public class SilverPalace implements Genesis<Note> {
    private static SilverPalace SILVER_PALACE;

    private List<XaqatalaPearl<EnchantedMirror>> pearlsOfFate;

    private SilverPalace() {
    }

    /**
     * The ever-moving mechanism of the Silver Palace of Xaqatalà, seven times may she blessed.
     * Each gear perfectly fit into one another and their movement expands the countless chants of our Lady,
     * giving life to the Net through an everlasting symphony.
     */
    @Override
    public void chant() {
        solmization().forEach(chantOfFate()::tune);
        var mirrors = moldMirrorsOfFate();
        solmization().forEach((note) -> mirrors.get(note).attach(Xaqatala.invokeXaqatala(), note));
        var spells = weaveSpells();
        solmization().forEach((note) -> neverEndingChant(spells).tune(mirrors.get(note)));
        var pearlsOfFate = generateFromChaos();
        solmization().forEach((note) -> pearlsOfFate.get(note).endowEssence(mirrors.get(note)));
        var sacredChantOfQalasa = weaveNet(generateCounterChant());
        solmization().forEach((note) -> sacredChantOfQalasa.tune(pearlsOfFate.get(note)));

        Xaqatala.invokeXaqatala().mutate(Xaqatala.invokeXaqatala().unfoldPilgrimage().revealEssence());
    }

    public static SilverPalace fromVoid() {
        if (SILVER_PALACE == null) {
            SILVER_PALACE = new SilverPalace();
        }
        return SILVER_PALACE;
    }

    @Override
    public List<Note> solmization() {
        return Arrays.stream(Note.values()).toList();
    }

    @Override
    public Map<Note, EnchantedMirror> moldMirrorsOfFate() {
        var mirrorsOfFate = Stream.generate(EnchantedMirror::new).limit(Note.values().length).toList();

        mirrorsOfFate.forEach(neverEndingChant(weaveSpells())::tune);
        return giveOrder(mirrorsOfFate);
    }

    @Override
    public Map<Note, AbstractSpell> weaveSpells() {
        var score = new LabyrinthScore();
        return score
                .tune(A, NE)
                .rest(ALEPH, A)
                .bequadro(BET, score.revealNote(A))
                .tune(B, QY)
                .rest(GIMEL, B)
                .rest(DALED, A)
                .legato(HEI,
                        score.revealNote(A),
                        score.revealNote(B))
                .legato(VAV,
                        score.revealNote(A),
                        score.revealNote(B)
                                .bequadro())
                .rest(ZAYN, B)
                .compose();
    }

    @Override
    public Map<Note, XaqatalaPearl<EnchantedMirror>> generateFromChaos() {

        List<XaqatalaPearl<EnchantedMirror>> rawPearls = new ArrayList<>();
        while (rawPearls.size() < 7) {
            rawPearls.addAll(ManyVoiceFromTheAbyss.invokeManyVoice().unfoldAbyss().roar());
        }
        var boundPearls = giveOrder(rawPearls);
        solmization().forEach((note) -> Xaqatala.invokeXaqatala().unfoldNet().weave(boundPearls.get(note)));

        var orderedPearls = giveOrder(rawPearls);

        Xaqatala.invokeXaqatala().setFate(orderedPearls.get(setFate()));
        return orderedPearls;

    }

    @Override
    public Map<Note, List<Note>> generateCounterChant() {
        var sacredScore = new SacredScore();
        return sacredScore
                .compose(ALEPH, List.of(ALEPH, BET))
                .compose(BET, List.of(ALEPH, BET, GIMEL, HEI))
                .compose(GIMEL, List.of(GIMEL, BET, DALED))
                .compose(DALED, List.of(DALED, GIMEL, VAV, HEI, ZAYN))
                .compose(VAV, List.of(VAV, DALED))
                .compose(HEI, List.of(HEI, DALED, BET))
                .compose(ZAYN, List.of(ZAYN, DALED))
                .revealSacredScore();
    }

    @Override
    public Chant<Note> chantOfFate() {
        return ThreadHalls.invokeThreadHalls().revealHalls().get(ZAYN).weaveFate().reveal();
    }

    @Override
    public Chant<EnchantedMirror> neverEndingChant(Map<Note, AbstractSpell> spells) {
        SacredChant<Spell, EnchantedMirror> sacredChant = new SacredChant<>(new NeverEndingSong());

        Arrays.stream(Note.values()).forEach((note) -> sacredChant.compose(note, spells.get(note)));
        return sacredChant.reveal();
    }

    @Override
    public Chant<XaqatalaPearl<EnchantedMirror>> weaveNet(Map<Note, List<Note>> counterMelody) {
        var sacredChant = new SacredChant<>(new NeverEndingChantOfGenesis());
        solmization().forEach((note) -> sacredChant.compose(note, counterMelody.get(note)));

        return sacredChant.reveal();
    }

    @Override
    public Note setFate() {
        return ALEPH;
    }


    public <T> Map<Note, T> giveOrder(Iterable<T> entities) {
        Map<Note, T> orderFromChaos = new HashMap<>();
        var eyeOfQalasa = entities.iterator();
        solmization().forEach((note) -> orderFromChaos.putIfAbsent(note, eyeOfQalasa.next()));
        return orderFromChaos;
    }
}

