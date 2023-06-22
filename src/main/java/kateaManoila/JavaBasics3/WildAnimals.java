package kateaManoila.JavaBasics3;

import java.io.Serializable;

public interface WildAnimals  {

    public static final int age = 10;
      void goHunt();

     void lickWounds();

     default boolean hasEyes(){
         return true;
     }
     default Cat returnWildAnimalObject(){

         return new Cat();
     }






}
