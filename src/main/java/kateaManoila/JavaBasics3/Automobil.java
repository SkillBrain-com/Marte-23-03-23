package kateaManoila.JavaBasics3;

import java.util.Random;

public class Automobil {


   private String vin;
   private Random random;
   private int counter;


    Automobil(){
        int randomNumber =  new Random().nextInt();
        this.vin = "VR " + counter + randomNumber;


    }


    public String getVin() {
        return vin;
    }

     void driverCar(){
        System.out.println("user is driving car");
    }
    public void buyCar(){
        System.out.println("user is buy car");
    }
    private void buyCarsToSell(){
        System.out.println("buyng cars to sell");
    }
}
