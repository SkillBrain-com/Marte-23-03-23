package kateaManoila.JavaBasisc2;

import java.util.Arrays;

public class javaBasicsPoilndrom {

    //polindrom este cuvintul care e scris de la inceput si de la sfirsit ana-ana


    public static void main(String[] args) {
        String polindrome = "SUGUS"; //literal
        String antoherPolindrome = new String("SUGUS");

//        System.out.println( System.identityHashCode(polindrome));
//        System.out.println( System.identityHashCode(antoherPolindrome));
//        System.out.println(polindrome == antoherPolindrome); //asa nu
 //       System.out.println(polindrome.equals(antoherPolindrome)); //asa da

        System.out.println(isPolindrome("Ana")); //ASCII
        String[] stringArray = {"50", "9", "500"};
        printStringArray(stringArray);
        Arrays.sort(stringArray);
        System.out.println();
        printStringArray(stringArray);

    }

    static boolean isPolindrome(String original) {
        String reverse = ""; // a d c e t
        for (int i = original.length() - 1;i>=0; i--){
            reverse += original.charAt(i);

        }
        System.out.println("Reverse word is" + reverse);
        return original.equalsIgnoreCase(reverse);









    }
    static void printStringArray(String[] stringArray){
        for (String word: stringArray) {
            System.out.print(word +", ");
        }
    }









}

