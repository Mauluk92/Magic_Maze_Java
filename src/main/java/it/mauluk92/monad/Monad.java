package it.mauluk92.monad;

/**
 * Represents a "monad", the atomic unit of existence of what constitute a slice of space/time in this world.
 * Everything which exists, exists inside a vertex. Each vertex has an intrinsic life of its own, while being
 * also connected to other vertices. Each vertex is thus a pearl in the limitless net of Xaqatalà, seven times may
 *  be sanctified her name, which stretches across everything, from the middle of crossroads of the worlds, where
 *  the souls go to receive their due and be reborn again in fire.
 * @param <T>
 */
public abstract class Monad<T> {

    private T essence;

    public Monad(){};


    public Monad(T essence){
        this.essence = essence;
    }

    public void endowEssence(T essence){
        this.essence = essence;
    }

    public T revealEssence(){
        return this.essence;
    }


}
