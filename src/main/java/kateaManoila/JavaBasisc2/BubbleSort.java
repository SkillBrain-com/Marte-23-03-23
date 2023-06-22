package kateaManoila.JavaBasisc2;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = {20, 30, -15, 7, 55, 1, -22};
        Arrays.sort(intArray);
        printArray(intArray);


        printArray(intArray);
        //              {20, -15, 30, 7,  55, 1, -22 }
        //           {20, -15, 30, 7, 55, 1, -22 }
        //           {20, -15, 7,  30,  1, -22, 55}
        //           {20, -15, 7, 1, -22, 30, 55}

        //-22, -15, 1, 7, 20, 30,55 sorted;

        bubbleSort(intArray);
        System. out .println("=======");
        printArray(intArray);








    }


    static void bubbleSort(int[] array) {

       for(int lastUnstoredIndex = array.length -1; lastUnstoredIndex > 0; lastUnstoredIndex--){
           for(int i = 0; i < lastUnstoredIndex -1; i++){
               if (array[i] > array[i + 1]) {
                   //swap elements
                   swap(array, i, i + 1) ;
               }
           }
       }
    }


    static void swap(int[] array, int i, int j) {
        if(i == j){
            return;//ese din metoda
        }
        int temp = array[i] ;
        array[i] = array[j] ;
        array[j] = temp ;
    }
    static void printArray(int[]array){
        for(int element : array) {
            System.out .println(element);

        }
    }

}









