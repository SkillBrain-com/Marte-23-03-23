package FayedMustafa.JavaBasics2;

public class MinMax {


    public static void main(String[] args) {

        int[] arr = {5, 15, 28, 78, 36, 54, -2, 10, 74,};
        int minim = minNumber(arr);
        System.out.println("min=" + minim);
        int maxim = maxNumber(arr);
        System.out.println("max=" + maxim);

    }


    static int minNumber(int[] array) {
        int min = 100;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        return min;

    }

    static int maxNumber(int[] array) {
        int max = 0;
        for (int i = 0; i > array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;
    }

}
