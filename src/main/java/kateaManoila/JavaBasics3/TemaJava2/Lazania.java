package kateaManoila.JavaBasics3.TemaJava2;

public class Lazania {


    public static void main(String[] args) {

        remainingMinutesInOven(30);
        preparationTimeMinutes(3);
      int totalTime =  totalTimeInMinutees(3, 20);
        System.out.println("Total time in preparation" + totalTime);


    }
    static int totalTimeInMinutees(int layers, int timeInOven) {
        return  preparationTimeMinutes(layers) +  remainingMinutesInOven(timeInOven);

    }




    static  int preparationTimeMinutes(int layers){

        return layers * 2 ;
    }


    static int expecteMinutesInOven() {

        return 40 ;
    }



    static int remainingMinutesInOven(int minutesInOven){
        ;
        return expecteMinutesInOven() - minutesInOven;

    }





}
