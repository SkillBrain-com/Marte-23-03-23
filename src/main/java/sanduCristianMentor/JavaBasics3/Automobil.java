package sanduCristianMentor.JavaBasics3;

import java.util.Random;

public class Automobil {

    private String vin;
    private Random random;
    private int counter;

    public Automobil() {
        int randomNumber = new Random().nextInt();
        this.vin = "VR" + counter + randomNumber;
    }

    public String getVin() {
        return vin;
    }
    void driveCar() {
        System.out.println("user is driving car");
    }

    public void buyCar() {
        System.out.println("user buys the car");
    }

    private void buyCarsToSell() {
        System.out.println("buying cars to sell");
    }

    @Override
    public String toString() {
        return "This is an automobile";
    }
}
