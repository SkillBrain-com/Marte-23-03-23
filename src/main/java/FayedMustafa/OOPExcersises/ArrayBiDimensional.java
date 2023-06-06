package FayedMustafa.OOPExcersises;

public class ArrayBiDimensional {

    public static void main(String[] args) {

        char[][] arr =
                {
                {'A','B','C'},
                {'D','E','F'},
                {'G','H','I'}

        };
        for(int i = 0; i < arr.length; i++){
            for( int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j]);

            }

        }
        System.out.println();

    }
}


