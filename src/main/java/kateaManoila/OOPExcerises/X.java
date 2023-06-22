package kateaManoila.OOPExcerises;

public class X {
    X(){
        super();
    }
    void  greet(){
        System.out.println("Good Morning!");
    }

}
class Y extends X{
    @Override
    void greet() {
        System.out.println("Good Afternoon");
    }
}
class Z extends Y{
    @Override
    void greet() {
        System.out.println("Good Night!");
    }
}
class TestZ{
    public static void main(String[] args) {
        X x = new Z();
        x.greet();
        ((Y)x).greet();
        ((Z)x).greet();
    }
}
