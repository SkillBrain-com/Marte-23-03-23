package sanduCristianMentor.JavaBasics3;

public class Cat extends Animal {


    @Override
    public void makeNoise() {
        System.out.println("Miau-Miau");
    }

    @Override
    public void canWalk() {
        System.out.println("No, prefers to sleep");
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public void canEat() {
        System.out.println("Eating Whiskas!");
    }
}
