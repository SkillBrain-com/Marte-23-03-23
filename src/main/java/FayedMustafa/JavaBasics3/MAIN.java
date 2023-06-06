package FayedMustafa.JavaBasics3;

public class MAIN {

    public static void main(String[] args) {
       GeometricFigure circle = new Circle();
       // casting(transformate)
        ((Circle)circle).setR(12.5);
        System.out.println(((Circle)circle).getR());
        System.out.println(circle.getArea());
        //Runtime polymorphism-- executia codului -> @override
        // compile- time polymorphism - compilarea codului -> @overload
        GeometricFigure rectangle =  new Rectangle();
        ((Rectangle)rectangle).setH(12);
        ((Rectangle)rectangle).setL(11.5);
        System.out.println(((Rectangle)rectangle).getH());
        System.out.println(((Rectangle)rectangle).getL());
        System.out.println(rectangle.getArea());
        System.out.println("================================");

        WildAnimals jaguar = new Jaguar();
        jaguar.goHunt();
        System.out.println("Has eyes " + jaguar.hasEyes());

    }


}
