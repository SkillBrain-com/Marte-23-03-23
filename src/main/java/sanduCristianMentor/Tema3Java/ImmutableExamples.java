package sanduCristianMentor.Tema3Java;

public class ImmutableExamples {

    public static void main(String[] args) {
        // Immutable - nemodificabil
        int i = 10; // int literal
        String example = "Example";  // string literal
        String anotherOtherExample = "Example";
        String anotherExample = new String("Example");

        System.out.println(System.identityHashCode(example));
        System.out.println(System.identityHashCode(anotherOtherExample));
        System.out.println(System.identityHashCode(anotherExample));

        // Heap si Stack
        // String pool ->  var1, var2 ->  same@hashMemory
        System.out.println(example.equals(anotherExample));
        System.out.println(anotherExample.equals(anotherOtherExample));


    }
}
