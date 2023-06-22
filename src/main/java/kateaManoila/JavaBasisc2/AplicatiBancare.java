package kateaManoila.JavaBasisc2;

import java.util.Scanner;

public class AplicatiBancare {
    public static void main(String[] args) {

        int pin = 3124;
        boolean cardBlocat = false; // fleg-boolian
        int numarIncercari = 3;


        while (numarIncercari > 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Va rog sa introduceti codul pin");
            int codPin = scanner.nextInt();
            if(codPin == pin){
                System.out.println("Bine ai venit !");
                System.out.println("Uizer sa logat cu succes");
                break;
            } else {
                System.out.println("Codul pin este gresit, va rugam incercati din nou");
                numarIncercari -- ;
                System.out.println("Mai aveti" + numarIncercari + "incercari");


            }
            if(numarIncercari == 0){
                cardBlocat = true;
                System.out.println("Cardul a fost blocat, va rugam contactati banca");
            }

        }

    }

}
