package sanduCristianMentor.Tema3Java;

import java.util.List;

public class PigLatin {
    private static final List<Character> VOWEL_LIST = List.of('a', 'A','e', 'E','i',
            'I','o', 'O','u', 'I', 'y', 'Y');

    public static void main(String[] args) {

        System.out.println("Homecoming".substring(3));

        System.out.println(pigLatin("Sparta"));
        System.out.println(pigLatin("Little"));
        System.out.println(pigLatin("xray"));
        System.out.println(pigLatin("Abecedar"));
        System.out.println(pigLatin("chair"));
        System.out.println(pigLatin("rhythm"));
        String faraVocale = "Hrrrts";
        //  Sparta  -> arta + Sp
        // arta -> + Sp
        // artaSp + ay
        // artaSpay
    }

    public static String pigLatin(String input) {  // input = "Sparta"
        String pigLatinResponse = "";  // final response
        int i;
        for(i = 0; i < input.length(); i++) {
            if (esteVocala(input.charAt(i))) {
                pigLatinResponse = input.substring(i);  //  "arta"
                break;
            }
        }
        if(i == input.length()) {
            return "";
        }
        pigLatinResponse += input.substring(0, i) + "ay"  ;  //  "arta"
        return pigLatinResponse;
    }

    private static boolean esteVocala(char c) {
        if(VOWEL_LIST.contains(c)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
