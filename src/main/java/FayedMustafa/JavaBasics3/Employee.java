package FayedMustafa.JavaBasics3;

import java.time.LocalDate;

public class Employee extends Person {
   public int id;
    LocalDate dateOfEmployment;
    double yearsOfExperience;

    public int getId() {
        return id;
    }
    Employee(){
        super();
        this.id++;
    }


    public static void main(String[] args) {
        Employee mustafa = new Employee();
        mustafa.canTalk();
        mustafa.canWalk();
        mustafa.name = "Mustafa";
        mustafa.age = 28;
        mustafa.adress = "acasa";
        System.out.println(mustafa.age);
        System.out.println();
        Person p = new Person();
        Person george = new Person("George", "Mihai");
        Person andrei = new Person( 25);
        Person popescu = new Person(15);



    }
    public void doWork(){
        System.out.println("Working");
    }


// classes -> default value null
// numbers -> default value 0
// floating number -> default value 0.0
// booleans -> default value false
// variabile cu final = constante
// metode cu final = nu pot fi suprascrise
// clase cu final = nu pot fi mostenite





}
