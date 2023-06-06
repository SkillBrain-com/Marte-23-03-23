package FayedMustafa.JavaBasics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Lists {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        System.out.println();
        stringList.add("Textul de la prima linie");
        stringList.add("Textul de la a doua pozitie");
        stringList.add("Textul de la a treia pozitie");
        stringList.add("Textul de la a saptea pozitie");
        System.out.println(stringList);
        stringList.remove("Textul de la a doua pozitie");
        System.out.println(stringList);
        stringList.remove(2);
        System.out.println(stringList);
        stringList.set(1, "Mustafa");
        System.out.println(stringList);
        String[] strings = new String [2];
        double[] doubles = new double [3];
        Object[] objects = new Object [5];
        // listele nu accepta primitive
        // array-urile accepta si primitive
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(50);
        System.out.println(ints);

        List<Double> doubleList = Arrays.asList(1.1, 5.0, 0.99);
        doubleList.add(20.5);
        System.out.println(doubleList);
        // Arrays.asList() -> dimensiunea este fixa


        ArrayList<List> list = new ArrayList<>();

    }


}
