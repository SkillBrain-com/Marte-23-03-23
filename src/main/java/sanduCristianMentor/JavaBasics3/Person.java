package sanduCristianMentor.JavaBasics3;

import java.time.LocalDate;

public class Person {

    private static int counter;
    static String className;

    String name;
    String surName;
    int age;
    LocalDate dateOfBirth;
    String address;
    final String SPECIE = "HOMO SAPIENS";

    Person() {
        super();
        counter++;
    }

    public Person(String name, String surName) {
        counter++;
        this.name = name;
        this.surName = surName;
        System.out.println("Calling second constructor.");
    }

    void canTalk() {
        System.out.println("Person can talk.");
    }

    void canWalk() {
        System.out.println("Person can walk.");
    }

    static void inTheClass() {
        System.out.println("Printing from class.");
    }

    void sayHello() {
        System.out.println("Hello from Person object!");
    }






















}
