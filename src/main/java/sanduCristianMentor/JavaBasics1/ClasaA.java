package sanduCristianMentor.JavaBasics1;

public class ClasaA {
    int x = 10;
    // Metoda asta cacluleaza bonsul la salariu (Doamne ajuta)
    // Prescurtari
    // System.out.println()   ->  sout
    // public static void main() {}   -> psvm

    public static void main(String[] args) {

//        int x = 10;
//        System.out.println(x);
//        String prenume = "Bogdan";
//        String nume = "Popescu";
//
//        System.out.println(prenume + " " + nume);
//        System.out.println(10+15);

        //  ++  -> incrementare   ->  se aduna cu 1  ( +1)

//        int a  = 12;
//        System.out.println(a);    //  12
////        System.out.println(a++);   //  tot 12
//        System.out.println(--a);  // 13

//        System.out.println(!true);
//        System.out.println(!false);

//        int a = 10;  // = atribuie o valoare
//        int b = 10;   //  == verifica egalitate
//        System.out.println(a == b);

        // AND  -> && -> ca toate conditiile sa fie adevarate
        // OR   -> ||  -> minim o conditie e adevarata

//        if((10 != 12) && (6 == 6) && (5 == 3) && (100 ==200) || (1 ==1)) {
//            // if ( (true) && (true) && (false) && (false) || (true)
//            // if (  (true) && (false) && (false)  || (true) )
//            // if ( false && false || true )
//            System.out.println("Conditia este adevarata!");
//        }

        //  operator ternar (ternary)  ->
        //  ?   ->   "Daca este true" : "Daca este false"
//        System.out.println(10 != 12? "":"Nu e aer");

//        int a = 10;
//        int b = 12;
//        int c = a + b;
//        System.out.println(c);
//        int d = -1234;
//        int e = 102;
//        int f = d + e;
        //  DRY (uscat) -> DO NOT REPEAT YOURSELF!
//        int sum1 = sumaNumere(10, 12);
//
//
//        System.out.println(sum1);
//        int pozitiv = 10;
//        int negativ = - 5;
//        System.out.println(pozitiv != negativ);
//
        boolean isTrue = true;
        boolean isFalse  = false;


        System.out.println(!isTrue);
        doSomething();






    }

    static long doSomething() {
        System.out.println(15L);
        return 15L;
    }

    static void sum(int x1, int x2) {
        int suma = x1 + x2;
        System.out.println(suma);
    }


    static int sumaNumere(int x1 , int x2) {
        int suma = x1 + x2;
        return suma;
    }






}





