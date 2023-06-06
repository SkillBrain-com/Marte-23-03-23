package FayedMustafa.JavaBasics2;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = {20,30,-15,8,55,1,-22};


    }

 static void bubbleSort(int[] array, int i) {
        for(int  lastUnsortedIndex = array.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        for(i=0; i< array.length; i++){
            if(array[i] >  array[i+1]){
                // swap elements
                swap(array, i, i+1);
            }

        }

 }

    static void swap(int[] array, int i, int j){
        if(i==j){
            return;
        }
        int temp = array [i];
        array[i] = array [j];




    }



}
