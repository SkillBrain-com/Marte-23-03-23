package kateaManoila.JavaBasics3;

public class Dog extends Animal{


    @Override
    public void makeNoise() {
        System.out.println("Barks! Ham-Ham");

    }

    @Override
    public void canWalk() {
        System.out.println("Going for a walk on faur legs");

    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public void canEat() {
        System.out.println("Eating denstasticks");
    }
}
