package kateaManoila.JavaBasics3;

import java.time.LocalDate;

public class Employee extends Person {

    private static int id;
    LocalDate dateOfEmployment;
    double yearsOfExperience;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Employee(){
        super();
        this.id ++;

   }

    private void doWork(){
        System.out.println("Working.");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from Employee Object!");
    }


    public void sayHello(String message){
        System.out.println("Hello " + message);

    }
    public void sayHello(int number){
        System.out.println("Hello the number you entered is" + number);

    }


}

