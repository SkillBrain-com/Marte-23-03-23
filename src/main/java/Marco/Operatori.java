package Marco;

public class Operatori {
    public static void main(String[] args) {

        // Aritmetici
        System.out.println(42 + 8);

        // Unari
        int a = 15;
        int b = -18;
        System.out.println(a);
        ++a;  // incrementare, se adauga 1
        System.out.println(a);


        System.out.println(!true);
        System.out.println(!false);

        int c = 12;  // = atribuie o valoare
        int d = 11;  // == verifica o egalitate    <-- Relationari

        System.out.println(c != d);

        // Conditionali
        // AND  --> &&  --> ca toate conditiile sa fie adevarate
        // OR  --> ||  --> minim o conditie este adevarata



        if(((10 != 12) && (5 == 6))) {
            System.out.println("conditia este adevarata!");
        }

        System.out.println(10 == 12? "sunt" : "nu sunt"); //operatori  ternari, primul text customizabil
        // este adevarat si celalalt fals



    }
}

