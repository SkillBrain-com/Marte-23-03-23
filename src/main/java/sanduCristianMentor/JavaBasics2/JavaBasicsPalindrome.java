package sanduCristianMentor.JavaBasics2;

import java.util.Arrays;

public class JavaBasicsPalindrome {


    // sugus  -> sugus -> Palindrome
    public static void main(String[] args) {
        System.out.println(isPalindrome("Nanan")); // ASCII
        String[] stringArray ={"50" , "9", "500"};
        printStringArray(stringArray);
        Arrays.sort(stringArray);
        System.out.println();
        printStringArray(stringArray);


    }

    static void printStringArray(String[] stringArray) {
        for (String word: stringArray) {
            System.out.print(word +", ");
        }
    }

    static boolean isPalindrome(String original) {
        String reverse ="";  // a d c e t
        for(int i = original.length() - 1; i>=0; i--) {
            reverse += original.charAt(i);
        }
        System.out.println("Reverse word is " + reverse);
        return original.equalsIgnoreCase(reverse);
    }



}


