package FayedMustafa.JavaBasics3;

import java.time.LocalDate;
import java.util.Date;

public class Person {

    String name;
    String surName;
    int age;
    LocalDate dateOfBirth;
    String adress;
    final String SPECIE = "HOMO SAPIENS";
    Person(){
        //constructor
        super(); // ->trebuie sa fie mereu prima linie de cod in constructor
    }
    Person(String name, String surName){
        this();
        this.name = name;
        this.surName = surName;
    }

    public Person( int age) {
        this("Popescu", "Bogdan");
        this.age = age;
    }



    static void canTalk(){
        System.out.println("Person can talk.");
    }
     void canWalk(){
        System.out.println("Person can walk.");
    }

    static void inTheClass(){
        System.out.println(" Printing from class.");
    }

    public static void main(String[] args) {
        Person person = new Person();
        canTalk();
        person.canWalk();
        inTheClass();


    }






}
