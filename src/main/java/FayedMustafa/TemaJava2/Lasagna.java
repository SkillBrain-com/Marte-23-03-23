package FayedMustafa.TemaJava2;

public class Lasagna {
    public static void main(String[] args) {
        remainingMinutesInOven(30);
        preparationTimeInMinutes(2);
        int totalTime = totalPreparationTimeInMinutes(3, 20);
        System.out.println("Total time in preparation " + totalTime);





    }


    static int totalPreparationTimeInMinutes(int layers, int timeInOven){
        return preparationTimeInMinutes(layers) + remainingMinutesInOven(timeInOven);
    }

   static int expectedMinutesInOven(){
       int expectedTime= 40;
       System.out.println(expectedTime + " minutes");
       return expectedTime;
   }


   static int remainingMinutesInOven(int minutesInOven){
        int remainingMinutes = expectedMinutesInOven() - minutesInOven;
       System.out.println("Remaining minutes in oven: " + remainingMinutes + "min");
       return remainingMinutes;
   }

   static int preparationTimeInMinutes(int layers){
        int preparationTime = layers * 2;
       System.out.println("Preparation time is: " + preparationTime);
        return layers * 2;
   }







}
