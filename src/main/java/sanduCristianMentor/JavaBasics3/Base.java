package sanduCristianMentor.JavaBasics3;

public class Base {
    static void print() {
        System.out.println("BASE");
    }
}
class Derived extends Base {
    static void print() {
        System.out.println("Derived");
    }
}

class Test {

    public static void main(String[] args) {
        Base b = null;
        Derived d = (Derived) b;
        Base.print();
        Derived.print();
    }
}



