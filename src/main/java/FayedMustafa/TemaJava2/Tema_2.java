package FayedMustafa.TemaJava2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tema_2 {
    public static void main(String[] args) {
        // EX 1

        int numarScanner = scanner();
        int numarulrandom = getRandomNumber();
        System.out.println("Numarul random generat este" + " " + numarulrandom);

        if (numarScanner < numarulrandom) {
            System.out.println("Numarul introdus este mai mic decat" + " " + numarulrandom);
        } else {
            System.out.println(" ");
        }


        // EX 2

        int valoareuser1 = valoare1();
        int valoareuser2 = valoare2();
        switch (valoare3()) {
            case "a":
                System.out.println("Rezultatul adunarii este" + " " + (valoareuser1 + valoareuser2));
                break;
            case "s":
                System.out.println("Rezultatul scaderii este" + " " + (valoareuser1 - valoareuser2));
                break;
            case "i":
                System.out.println("Rezultatul inmultirii este" + " " + (valoareuser1 * valoareuser2));
                break;
            case "p":
                System.out.println("Rezultatul impartirii este" + " " + (valoareuser1 / valoareuser2));
                break;
            case "m":
                System.out.println("Rezultatul modulului este" + " " + (valoareuser1 / valoareuser2));
            default:
                System.out.println("Litera incorecta, va rugam intorduceti una dintre literele de mai sus !!!");
        }


        //EX 3
        int[][] intArray = {{2, 78, 99}, {10, 17, 4, 20, 88}};
        System.out.println(intArray[0][2]);
        System.out.println(intArray[0][0]);
        System.out.println(intArray[1][0]);
        System.out.println(intArray[1][4]);


//        //EX 4
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        System.out.println("Al 2lea carater din lista este" + " " + charArray[1]);
        System.out.println("Al 4lea carater din lista este" + " " + charArray[3]);

        //EX5
        double[] doubleArray = {10.1, 2.5, 7.9, 4.5, 11.6, 99.0, 1.3};
        for (double d : doubleArray) {
            if (d == 4.5) {
                System.out.println(d);
            } else {
                System.out.println("Element mai mare ca 5");
            }
        }

        //EX6
        int[] integerArray9 = {66, 44, 89, 9, 1, 2, 0, 43, 67};
        for (int index = 0; index < integerArray9.length; index++) {
            while (index < 7) {
                System.out.println("Index Valid");
                index++;
            }


        }

        //EX 7
        int[] arrayLista = {55, 7, 2, 9, 13};
        {
            int suma = sumaArray(arrayLista);
            System.out.println("Suma listei este" + " " + suma);


        }

        //EX 8
        int[] arrayGol = new int[0];
        if (arrayGol.length == 0) {
            System.out.println("Array is empty");
        }
        List<String> txtList = new ArrayList<String>();
        if(txtList.size()==0){
            System.out.println("List is empty");
        }



    }


    // SUBPUNCTUL B EX 1
    static int scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar");
        int valoareintrodusa = scanner.nextInt();
        return valoareintrodusa;
    }

    static int getRandomNumber() {
        Random randomnumber = new Random();
        return randomnumber.nextInt(1, 100);
    }


    //SUBPUNCTUL B EX 2
    static int valoare1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar");
        int valoareuser1 = scanner.nextInt();
        return valoareuser1;
    }

    static int valoare2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti  inca un numar");
        int valoareuser2 = scanner.nextInt();
        return valoareuser2;
    }

    static String valoare3() {
        Scanner scannerChar = new Scanner(System.in);
        System.out.println(" Introduceti una  dintre literele urmatoare pentru a definii operatia dorita: a, s, i, p ,m");
        String valoareuser3 = scannerChar.next();
        return valoareuser3;
    }

    //SUBPUNCTUL B EX 7
    static int sumaArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }


}
