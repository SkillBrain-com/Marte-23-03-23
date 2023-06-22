package kateaManoila.JavaBasics3;

public class Maim {


   public static void main(String[] args) {
 //     GeometricFigure circle = new Cerc();
//      //casting (transformare)
//      ((Cerc)circle).setR(12.5);
//      System.out.println( ((Cerc)circle).getR());
//      System.out.println(circle.getArea());
//      //Runtime polymorphism - executia codului -overriding
//      //compile-time polymorphism - compilarea codului-overloandig

//      Employee employee = new Employee();
//      employee.sayHello();
//      employee.sayHello("this is the second method");
//      employee.sayHello(5);


      WildAnimals jaguar = new Jaguar();
      jaguar.goHunt();
      System.out.println( WildAnimals.age);


      System.out.println(jaguar.age);

      System.out.println("Has eyes?" + jaguar.hasEyes());



   }








}
