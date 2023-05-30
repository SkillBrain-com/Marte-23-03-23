package sanduCristianMentor.JavaBasics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBasicsList {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        System.out.println();
        stringList.add("Cristian");
        stringList.add("Claudiu");
        stringList.add("Sandu");
        stringList.add("Alex");
        System.out.println(stringList);
        System.out.println(stringList.remove("Alex"));
        System.out.println(stringList);
        stringList.remove(2);
        System.out.println(stringList);
        stringList.set(1, "Sandu");
        System.out.println(stringList);
        stringList.clear();
        System.out.println(stringList);

        String[] strings = new String[2];
        double[] doubles = {0.0, 0.1};
        Object[] objects = new Object[5];

        ArrayList<List> list = new ArrayList<>();
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(50);
        ints.add(23);
        System.out.println(ints);

        // Arrays.asList()   -> dimensiunea este fixa!!!!
        List<Double> doubleList = Arrays.asList(1.1, 5.0, 0.99, -1.5);
        doubleList.remove(1.1);


        System.out.println(doubleList);






    }


}
