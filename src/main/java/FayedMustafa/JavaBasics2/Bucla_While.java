package FayedMustafa.JavaBasics2;

import java.util.ArrayList;

public class Bucla_While {
    public static void main(String[] args) {

//  BUCLA_WHILE
//        int[] numere = {12, 15, 20, 100, -1, 89, -24};
//        int counter = 0;
//        while (counter <numere.length) {
//            System.out.println("Valoarea este " + numere[counter]);
//            counter++;
//        }
//
//        ArrayList<Double> listDouble = new ArrayList<>();
//        listDouble.add(20.1);
//        listDouble.add(50.9);
//        listDouble.add(66.5);
//        listDouble.add(-20.0);
//        int i = 0;
//        while(i <listDouble.size()){
//            System.out.println(listDouble.get(i));
//            i++;
//        }
// BUCLA DO_WHILE
//        double suma = 0;
//        int t = 0;
//        do {
//            suma+= listDouble.get(t);
//            t++;
//        } while(t<listDouble.size());
//        System.out.println("Suma = " + suma);


        int[] array = {1, 10, -20, 33, 98, -100, 85};
        int sum = 0;
        int x = 0;
        do {
            sum = sum+ array[x];
            x++;
        } while (x < array.length);
        System.out.println("Suma = " +sum);
    }

}
