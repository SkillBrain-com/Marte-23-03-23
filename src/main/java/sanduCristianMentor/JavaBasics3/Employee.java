package sanduCristianMentor.JavaBasics3;

import java.time.LocalDate;

public class Employee extends Person {

    private static int id;
    LocalDate dataOfEmployment;
    double yearsOfExperience;



    public int getId() {
        return id;
    }

    Employee() {
        super();
        this.id++;
    }

    private void doWork() {
        System.out.println("Working.");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from Employee Object!");
    }



}
