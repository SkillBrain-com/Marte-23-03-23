package kateaManoila.JavaBasics3;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Person  {




   private static int counter;
    static String className ;


    String nume;
    String surNume;
    int age;
   LocalDate dateOfBirth;
    String address;
    final  String SPECIE = "HOMO SAPIENS";


    Person(){
        super();
        counter++;

    }


    public Person(String nume, String surNume) {

        counter++;
        this.nume = nume;
        this.surNume = surNume;
        System.out.println("Colling second constructor.");
    }

    public Person( int age) {
        this("Ctea","Manoila");
        this.age = age;
        System.out.println("Colling third constructor.");
    }

    public Person(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        System.out.println("Colling forth constructor.");
    }

    void canTalk(){
        System.out.println("Person can talk.");;

    }
    public void sayHello(){
        System.out.println("Hello form Person object!");
    }




}




