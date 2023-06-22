package kateaManoila.JavaBasisc1;

public class PrimeNumber {


    public static void main(String[] args) {
        boolean result = isPrimeNumber(7);
        System.out.println(result);




    }


    static boolean isPrimeNumber(int number){

        for(int i = 2; i < number; i++){
            if(number % i==0){
                return false;

            }
        }
        return true;
    }





}
