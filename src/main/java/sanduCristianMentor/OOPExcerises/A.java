package sanduCristianMentor.OOPExcerises;

public class A {
    A() {
        this(1);
        System.out.println("M");
    }
    A(int i) {
        System.out.println("N");
    }
}
class B extends A {

    B() {
        super();
    }

}

class TestB {
    public static void main(String[] args) {
        new B();
    }
}
