package FayedMustafa.OOPExcersises;

public class X {

    void greet() {
        System.out.println("Good Morning");
    }
}

class Y extends X {
    @Override
    void greet() {
        System.out.println("Good Afternoon");
    }
}

class Z extends Y {
    @Override
    void greet() {
        System.out.println(" Good night");
    }
}

class TestZ {
    public static void main(String[] args) {
        X x = new Z();
        x.greet();
        ((Y)x).greet();
        ((Z)x).greet();
    }

}