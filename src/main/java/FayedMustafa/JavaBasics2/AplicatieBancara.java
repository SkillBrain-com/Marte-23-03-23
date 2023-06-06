package FayedMustafa.JavaBasics2;

import java.util.Scanner;

public class AplicatieBancara {


    public static void main(String[] args) {
        int pin = 3124;
        boolean cardBlocat = false;
        int numarIncercari = 3;
        while(numarIncercari > 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Va rugam sa introduceti codul pin");
            int codPin = scanner.nextInt();
            if(codPin==pin){
                System.out.println("Bun venit");
                System.out.println("Userul s-a logat cu success");
                break;
            }else{
                System.out.println("Codu PIN este gresit, va rugam incercati din nou");
                numarIncercari--;
                System.out.println("Mai aveti " + numarIncercari + " incercari");
            }
            if(numarIncercari==0){
                cardBlocat=true;
                System.out.println("Cardul a fost blocat, va rugam contactati banca!");
            }
        }
    }
}
