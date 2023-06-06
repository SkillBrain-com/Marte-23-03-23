package FayedMustafa.OOPExcersises;

public class STUDENT {
    String name;
    int age;

    STUDENT() {
        this("James", 25);
        System.out.println("First constructor");

    }

    STUDENT(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Second contructor");
    }

    STUDENT(String name) {
        this.name = name;
    }
}

class TestMyStudent {
    public static void main(String[] args) {
        STUDENT s = new STUDENT();
        System.out.println(s.name + " :" + s.age);
    }


}





