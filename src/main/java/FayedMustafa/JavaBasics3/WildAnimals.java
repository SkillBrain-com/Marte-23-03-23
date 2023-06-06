package FayedMustafa.JavaBasics3;

public interface WildAnimals {

    void goHunt();
    void lickWounds();
    default boolean hasEyes(){
        return true;
    }
    default Cat returnWildAnimalObject(){
        return new Cat();
    }



}
