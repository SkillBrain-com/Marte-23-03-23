package FayedMustafa.JavaBasics2;

public class Aha {
    public static void main(String[] args) {
        outer_while:
        while (true) {
            int z = 0;
            inner_while:
            while (true) {
                if (z >= 10) {
                    break;
                } else {
                    System.out.println(z++);
                }
            }
        }
    }
}

