package FayedMustafa.JavaBasics3;

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
class Null {
    public static void main(String[] args) {

        Base b = null;
        Derived d =(Derived) b;
        Base.print();
        Derived.print();
    }
}

