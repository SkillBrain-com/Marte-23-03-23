package kateaManoila.JavaBasisc2;

public class javaBasisc2 {

    public static void main(String[] args) {
        boolean isFalse = false;

        if (isFalse == true) {
            System.out.println("Conditia este adevarata");

        } else {

            System.out.println("Conditea este false");
        }


    }

    static boolean returnBoolian() {
        return true;

    }


}


class JavaBasicsArray {



    public static void main (String[] args) {
 //       // o colectie de elemente identice (acelas tip)
  //      int numar = 10;
 //       int [] intArray = new int[5];//3-1
 //       //0,1,2
 //       //10<  9 indexul valabil este 9

 //       intArray[1] = 10 ;
 //       intArray[2] = 15 ;
 //       intArray[3] = 20 ;
  //      intArray[4] =25 ;

//        System .out .println(intArray[0]) ;
  //      for(int i=0; i < intArray.length; i++ ) {
 //           System .out .println(intArray[i]);
 //           //int->  intArray[0]
//            //int->  intArray[1]
 //           //int->  intArray[2]
 //       }
 //       String [] stringArray = { "Ana", "Vasile" }; // anonymous array
  //      int [] ints = { 1, 6, -100, -200};




        int [] intArray = {1, -1, 5, 10, 7, 20} ;
        // 15+7+20=42
        int suma = sumArray(intArray) ;
        System. out.println("suma="+suma) ;
        int[] b = {10,15,25};

        printArray(intArray);
        System.out.println("=============");
        printArray(b);
        System .out.println(sumArray(b));

    }
    //DRY (uscat) DON"T REPET YOURSELF


     static int sumArray (int[]array) {
        int sum = 0 ;
        for(int element: array) {
 //           sum = sum + element ;
            sum +=element;

        }
        return sum ;

    }


    static void printArray(int[] array) {
        for(int element:array) {
            System.out.println(element) ;
        }

    }

}







