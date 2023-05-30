package sanduCristianMentor.TemaJava2;

public class PrimeNumber {


    public static void main(String[] args) {

        boolean result = isPrimeNumber(30);
        System.out.println(result);

        System.out.println(isNegative(-52));



    }

    static boolean isNegative(int number) {
        return number < 0;
    }


    static boolean isPrimeNumber(int number) {
        for (int i=2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
         }
        return true;
    }




}
