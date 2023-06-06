package FayedMustafa.TEMA3JAVA;

public class BirdWatcher {

    private final int[] birdsPerday;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerday = birdsPerDay;
    }

    void getLastWeek() {
        for (int i = 0; i < birdsPerday.length; i++) {
            if (i == 0) {
                System.out.print("[" + birdsPerday[i] + ", ");
            } else if (i == birdsPerday.length - 1) {
                System.out.println(birdsPerday[i] + "]");
            } else {
                System.out.print(birdsPerday[i] + ", ");
            }

        }

    }

    int getToday(int[] birdsPerday) {
        return birdsPerday[birdsPerday.length - 1];
    }

    int incrementToday(int[] birdsPerday) {
        return getToday(birdsPerday) + 1;
    }
     boolean hasDaysWithoutBirds(int[] birdsPerday){
        boolean hasDaysWithoutBirds = false;
        for(int i = 0; i< birdsPerday.length; i++){
            if(birdsPerday[i] == 0){
                hasDaysWithoutBirds = true;
                return hasDaysWithoutBirds;
            }
        }
        return hasDaysWithoutBirds;
    }
    static int getBusyDays(int[] birdsPerdayy) {
        int busyDays= 0;
        for(int i = 0 ; i<birdsPerdayy.length; i++){
            if (birdsPerdayy[i]>= 5){
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

}
