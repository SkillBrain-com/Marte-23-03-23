package kateaManoila.JavaBasisc2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class javaBasicsList {


    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        System.out.println();
        stringList.add("Ecaterina");
        stringList.add("Manoila");
        stringList.add("Gheorghe");

        System.out.println(stringList);
        stringList.set( 1,"Gheorghe");
        System.out.println(stringList);
        stringList.clear();
        System.out.println(stringList);

        String[] strings = new String[2];
        double[] doubles = {0.0, 2.4, 1.6,};
        Object[] objects = new Object[5];


         //Arrays.asList() dimensiunea este fixa!!!!
        ArrayList<List> list = new ArrayList<>();
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(50);
        System.out.println(ints);



        List<Double> doubleList = Arrays.asList(1.1, 5.3, 7.3);





    }
}
