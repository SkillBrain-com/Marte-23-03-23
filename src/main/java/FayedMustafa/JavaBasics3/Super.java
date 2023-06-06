package FayedMustafa.JavaBasics3;

public class Super {

    public int num = 10;
}
class Sub extends Super {

    protected int num = 20;
}

class TestSuper{

    public static void main(String[] args) {

        Super obj =  new Sub();
        System.out.println(((Sub)obj).num +=2);

    }
}
