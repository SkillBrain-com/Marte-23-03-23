package FayedMustafa.TemaJava2;

public class BirdWatched {

    public static void main(String[] args) {
        int[] birdPerDay = {0, 2, 5, 3, 7, 8, 5};
        getLastWeek(birdPerDay);
        System.out.println(getToday(birdPerDay));
        System.out.println(incrementToday(birdPerDay));
        System.out.println(hasDaysWithoutBirds(birdPerDay));
        System.out.println(getCountForFirstDays(birdPerDay, 3));
        System.out.println(getBusyDays(birdPerDay));


    }





    static int getBusyDays(int[] array) {
        int busyDays= 0;
        for(int i = 0 ; i<array.length; i++){
            if (array[i]>= 5){
                busyDays++;
            }
        }
        return busyDays;
    }

    static int getCountForFirstDays(int[] array, int numberOfDays){
        int sum = 0;
        for( int i=0; i <numberOfDays;i++){
            sum+=array[i];
        }
        return sum;
    }

    static int incrementToday(int[] array) {
//        int today = getToday(array);
        return getToday(array) + 1;
    }

    static int getToday(int[] array) {
        return array[array.length - 1];
    }


    static void getLastWeek(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            } else if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }

        }

    }
    static boolean hasDaysWithoutBirds(int[] array){
        boolean hasDaysWithoutBirds = false;
        for(int i = 0; i< array.length; i++){
            if(array[i] == 0){
                hasDaysWithoutBirds = true;
                return hasDaysWithoutBirds;
            }
        }
        return hasDaysWithoutBirds;
    }
}
