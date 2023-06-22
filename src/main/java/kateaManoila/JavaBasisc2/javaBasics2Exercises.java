package kateaManoila.JavaBasisc2;

public class javaBasics2Exercises {


    public static void main(String[] args) {

//        int[] intArray = {10, 5};

//        int[] array = new int[]{10, 5, 11};
//        System.out.println(sumOfNumber(1,2,3,4,5,6,7,8,9,100));


        int[] intArray = {20, 30, -15, 7, 1, -22, 55, 1, -50};

        printArray(intArray);
        sortArray(intArray,'d');
        System.out.println();

        printArray(intArray);
        sortArray(intArray, 'a');
        System.out.println();
        printArray(intArray);



    }
    //varargs- variable arguments -int...numeVariabile


   //acesta se poate da la interviu
    static void sortArray(int [] array,char order){
      for(int i = 0; i < array.length; i++){
          for(int j = i+1; j<array.length; j++){
              switch (order){
                  case 'a':
                      if(array[i] > array[j]){
                          int temp = array[i];
                          array[i] = array[j];
                          array[j] = temp;
                      }
                      break;
                  case 'd':
                      if(array[i] < array[j]){
                          int temp = array[i];
                          array[i] = array[j];
                          array[j] = temp;
                      }
                      break;
              }

          }
      }

    }



    static void printArray(int[]array){
        for(int element : array) {
            System.out .print(element +", ");

        }
    }






    static int sumOfNumber(int... args) {
       int sum = 0;
       for (int i=0; i< args.length; i++){
           sum = args[i] + sum;
       }
       return sum ;




    }










}
