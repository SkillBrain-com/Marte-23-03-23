package FayedMustafa.OOPExcersises;

public interface Super {

    String name = "SUPER";
}

interface Sub extends Super {

}


class TestSuper {
    public static void main(String[] args) {

        Sub sub = null;
        System.out.println(Sub.name);
    }
}