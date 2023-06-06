package FayedMustafa;

import java.util.Scanner;

public class Tema1 {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        myVariables();
        ex6();
        ex7();
        ex8();




    }

        static void ex1() {
            System.out.println("Imi place Java");
        }

        static void ex2() {
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");}

        static void ex3(){
            int ana = 24;
            int david = ana - 6;
            System.out.println("Varsta lui David este:" + david);
        }

        static void ex4(){
        String toamna = "Toama cad frunzele";
            System.out.println(toamna);
        }


        public static void myVariables(){
            int anul = 2023;
            boolean isThisYear2023 = true;
            String y = "Totul merge bine";
            System.out.println((y) + " " + (anul) + " "  + (isThisYear2023));
        }
        static void ex6(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu te rog un numar!");
            int numarTastatura =  scanner.nextInt();
            System.out.println(" Introdu te rog inca un numar!");
            int numarTastatura2 = scanner.nextInt();
            System.out.println("Felicitari numarul  introdus este" + " " + numarTastatura);
            System.out.println("Felicitari numarul  introdus este" + " " + numarTastatura2);

        }

        static void ex7(){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Introdu te rog numarul dorit pentru calcul.");
          int numarGenerat=scanner.nextInt();
          System.out.println(numarGenerat + 5);
          System.out.println(numarGenerat - 12.3);
          System.out.println(numarGenerat * (-3.2));
          System.out.println(numarGenerat / 4);
          System.out.println("Rezultatele dvs au fost afisate!");
        }
        static void ex8(){
            int x = 2;
            int y = 12;

            // y = x * y;

            y = x + y;
            x = y - x;
            y = y - x;

            System.out.println(x);
            System.out.println(y);
         }


}





