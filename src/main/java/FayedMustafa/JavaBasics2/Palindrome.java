package FayedMustafa.JavaBasics2;

public class Palindrome {

    public static void main(String[] args) {
        String palindrome = "sugus"; // -> se scrie la fel dreapta--stanga
        String anotherPalindrome = "sugus";
        System.out.println(palindrome == anotherPalindrome); // ASA NU
        System.out.println(palindrome.equals(anotherPalindrome)); // ASA DA

        // comparatie intre 2 string-uri metoda equals nu ==

//        StringBuilder sb = new StringBuilder("sugus");
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);
        System.out.println(isPalindrome("apa"));

        String[] stringArray = {"50", "9", "500"};
    }

    static boolean isPalindrome(String original) {
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        System.out.println("Reverse word is" + reverse);
        return original.equalsIgnoreCase(reverse);
    }

}
