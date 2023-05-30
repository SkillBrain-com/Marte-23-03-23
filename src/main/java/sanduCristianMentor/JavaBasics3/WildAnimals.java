package sanduCristianMentor.JavaBasics3;

public interface WildAnimals {

    public static final int age = 10;

    void goHunt();
    void lickWounds();

    public default boolean hasEyes() {
        return true;
    }

    default Cat returnWildAnimalObject() {
        return new Cat();
    }

    static void printInterface() {
        System.out.println("WildAnimals interface");
    }



}
