package it.mauluk92.note;

/**
 * Notes are the chains through which our Lady gave form to the
 * chaos of the Many Voice Abyss
 */
public enum Note {

    ALEPH("Aleph"),
    BET("Bet"),
    GIMEL("Gimel"),
    DALED("Daled"),
    HEI("Hei"),
    VAV("Vav"),
    ZAYN("Zayn");

    private final String value;

    Note(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
