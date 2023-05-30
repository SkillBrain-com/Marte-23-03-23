package sanduCristianMentor.JavaBasics3;

public class Main {

    public static void main(String[] args) {
//        GeometricFigure circle = new Circle();
//        // casting ( transformare)
//        ((Circle) circle).setR(12);
//        System.out.println(((Circle) circle).getR());
//        System.out.println(circle.getArea());
        // Runtime polymorphism  - overriding
        // compile-time polymorphism - overloading

//        Person cristian = new Employee();
//        ((Employee) cristian).sayHello("this is Sparta");
//        ((Employee) cristian).sayHello(5);

        WildAnimals jaguar = new Jaguar();
        jaguar.goHunt();
        System.out.println(WildAnimals.age);

        System.out.println("Has eyes? " + jaguar.hasEyes());



    }




}
