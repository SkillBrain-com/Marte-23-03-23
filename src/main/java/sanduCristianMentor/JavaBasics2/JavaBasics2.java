package sanduCristianMentor.JavaBasics2;

import java.util.Random;

public class JavaBasics2 {

    public static void main(String[] args) {
        int a = 11;
        int b = 14;

        if (a < b) {
            System.out.println(a + " este mai mic decat " + b);
        } else if (a == b) {
            System.out.println(a + " este egal cu " + b);
        } else {
            System.out.println("Niciuna din conditii nu e adevarata");
        }
        System.out.println(a < b ? (a + " este mai mic decat " + b) : "Niciuna din conditii nu e adevarat");


//        boolean isTrue = true;
        // API   -  200,  401,  503
        String prenume = "cristian";
        String nume = "";
        switch (prenume.toUpperCase()) {
            case "cristian":
                nume = "Sandu";
                break;
            case "andrei":
                nume = "Popescu";
                break;
            default:
                nume = "este orfan";
        }

        System.out.println(nume);


        // switch nu accepta -boolean, long, float, double

        String browser = "chrome";

        Object driver = new Object();

        switch (browser) {
            case "chrome":
                Object chromeDriver = new Object();  // -> chrome driver is created
                break;
            case "firefox":
                Object fireFox = new Object();
                break;
            case "edge":
                Object edge = new Object();
                break;
            default:
                System.out.println("Please choose a browser");
        }

        System.out.println("starting testing...");
        //


    }
    static boolean returnBoolean() {
        return true;
    }
    static int getRandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(200, 503);
    }
}

class JavaBasicsArray {


    public static void main(String[] args) {
        // colectie de elemente identice (acealasi tip)
//        int numar = 10;
//        int [] intArray = new int[4];  // 3 - 1
//        // 0 1 2
//        // 10 ->  9 index valabil
//        intArray[0] = 5 ;
//        intArray[1] = 10 ;
//        intArray[2] = 15;
//        intArray[3] = 20;
//
//        for(int i=0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//            // 1 ->   intArray[0]
//            // 2 ->   intArray[1]
//            // 3 ->   intArray[2]
//        }
//
//        String [] stringArray = {"Ana", "Gigel"};  // anonymous array
//        int [] ints = {1, 5, 6, -100, -200};

        int [] intArray = {1, -1, 5, 10, 7, 20, 100, -200};
        //    15 + 7 + 20 = 22 + 20 = 42

        int suma = sumArray(intArray);
        System.out.println("suma = " + suma );
        int [] b = {10, 15, 25};

        printArray(intArray);
        System.out.println("===========================");
        printArray(b);




    }

    //     DRY (uscat) - DON"T REPEAT YOURSELF

    static int sumArray(int [] array) {
        int sum = 0;
        for(int element: array) {
//            sum = sum + element;
            sum += element;
        }
        return sum;
    }

    static void printArray(int[] array) {
        for(int element: array) {
            System.out.println(element);
        }
    }





}