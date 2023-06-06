package FayedMustafa.JavaBasics2;

public class PrimeNumber {

    public static void main(String[] args) {
        boolean result = isPrimeNumber(7);
        System.out.println(result);
        System.out.println(isPrimeNumber(5));
    }

    static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }


}

