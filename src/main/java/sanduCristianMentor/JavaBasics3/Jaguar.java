package sanduCristianMentor.JavaBasics3;

public class Jaguar extends Animal implements WildAnimals {


    @Override
    public void makeNoise() {

    }

    @Override
    public void canWalk() {

    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public void canEat() {

    }

    @Override
    public void goHunt() {
        System.out.println("Jaguar is hunting food");
    }

    @Override
    public void lickWounds() {
    }

    @Override
    public boolean hasEyes() {
        return false;
    }


}
