package kateaManoila.JavaBasics3;

public class X {

    public void A(){
        System.out.println("A");
    }
}
class Y extends X{
   public void B(){
        System.out.println("B");
    }
   @Override
   public void A(){
       System.out.println("A");
   }
   public void C(){
       System.out.println("C");
   }

}
class TestX{

    public static void main(String[] args) {
        X obj = new Y();
        obj.A();
        ((Y)obj).B();
        ((Y)obj).C();
    }
}
