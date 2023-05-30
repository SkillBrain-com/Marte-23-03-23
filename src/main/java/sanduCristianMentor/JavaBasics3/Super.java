package sanduCristianMentor.JavaBasics3;

public class Super {
    public int num = 10;
}
class Sub extends Super {
    public int num = 10;
}
class TestSuper {
    public static void main(String[] args) {
        Super obj = new Sub();
        System.out.println(obj.num += 2);
    }
}



