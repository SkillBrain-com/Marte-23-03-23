package sanduCristianMentor.OOPExcerises;

public class Student {

    String name;
    int age;

    Student() {
        this("James", 25);
        System.out.println("First constructor");
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Second constructor");
    }


}

class TestMyStudent {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }

}
