package sanduCristianMentor.OOPExcerises;

public interface Super {
   String name = "SUPER";
}
interface Sub extends Super {
}
class TestSuper {
    public static void main(String[] args) {
        Sub sub = null;
//        System.out.println(sub.name);  very very bad way
        System.out.println(Sub.name);  // good way

    }

}