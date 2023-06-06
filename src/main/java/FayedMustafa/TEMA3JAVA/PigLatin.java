package FayedMustafa.TEMA3JAVA;

import java.util.List;

public class PigLatin {
    private static final List<Character> VOWEL_LIST = List.of('a', 'A', 'e', 'E', 'i',
            'I', 'o', 'O', 'u', 'U', 'y', 'Y');

    public static void main(String[] args) {

        System.out.println(pigLatin("Sparta"));

    }
    public static String pigLatin(String input) {
        String pigLatinRespone = "";
        int i;
        for (i = 0; i < input.length(); i++) {
            if (esteVocala(input.charAt(i))) {
                pigLatinRespone = input.substring(i);
                break;
            }
        }

        if (i == input.length()) {
            return "String Gol";
        }
        pigLatinRespone += input.substring(0, i) + "ay";
        return pigLatinRespone;
    }
    private static boolean esteVocala(char c) {

        if (VOWEL_LIST.contains(c)) {
            return true;
        }
        return false;
    }


}
