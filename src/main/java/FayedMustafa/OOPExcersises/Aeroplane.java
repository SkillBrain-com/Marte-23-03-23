package FayedMustafa.OOPExcersises;

public class Aeroplane implements Flyable{
    @Override
    public void land() {
        System.out.println("Landing at " + -Flyable.horizontalDegree() + " degrees");
    }

    public static void main(String[] args) {
        new Aeroplane().fly();
        new Aeroplane().land();
    }
}
