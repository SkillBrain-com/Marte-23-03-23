package FayedMustafa.JavaBasics2;

import java.util.Random;

public class Curs {
    public static void main(String[] args) {
        int a = 11;
        int b = 5;

        if (a < b) {
            //!isFalse=negatie

            System.out.println(a + " " + "este mai mic decat " + " " + b);
        } else if (a == b) {
            System.out.println(a + " " + "este egal" + " " + b);
        } else {
            System.out.println(a + " " + "este mai mare decat" + " " + b);
        }

        //API -200 401 503

        int returnCode = getRandomNumber();
        switch (returnCode) {
            case 200, 201, 202:
                System.out.println("OK!");
                break;
            case 401, 403, 404, 405:
                System.out.println("CLIENT ERROR");
                break;
            case 503, 504, 505, 506, 507:
                System.out.println("SERVER ERROR");
                break;
            default:
                System.out.println("Invalid code");
                // switch-ul nu accepta boolean,long,float,double
        }
    }


    static int getRandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(200, 503);
    }

    static int numarulMeu() {
    Random numarulMeu = new Random();
    return numarulMeu.nextInt(1, 56750);
}
//static boolean returnBoolean(){
//return true;


class JavaBasicsArray {
    public static void main(String[] args) {
        // colectie de elemente de acelasi tip
        int[] intArray = new int[5];
        // indexarea incepe  de la pozitia 0 (pozitia obiectului)
        intArray[0] = 5;
        intArray[1] = 10;
        intArray[2] = 15;
        intArray[3] = 20;
        intArray[4] = 25;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    //String[] stringArray = {"Ana", "Gigel"}; // anonymus array


    int[] intArray = {1, -1, 5, 10, 7, 20};

    {
        int suma = sumArray(intArray);
        System.out.println("suma=" + suma);
        printArray(intArray);


    }

    static int sumArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            //sum = sum +element;
            sum += element;
        }
        return sum;


    }


    static void printArray(int[] array) {
        for (int element : array)
            System.out.println(element);

    }

}
}









