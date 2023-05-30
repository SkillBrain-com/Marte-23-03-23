package sanduCristianMentor.Tema3Java;

public class BirdWatcher {

    private final int[] birdPerDay;

    public BirdWatcher(int[] birdPerDay) {
        this.birdPerDay = birdPerDay;
    }

    void getLastWeek() {
        for (int i = 0; i < birdPerDay.length; i++) {
            if (i == 0) {
                System.out.print("[" + birdPerDay[i] + ", ");
            } else if (i == birdPerDay.length - 1) {
                System.out.println(birdPerDay[i] + "]");
            } else {
                System.out.print(birdPerDay[i] + ", ");
            }
        }
    }


    int getBusyDays() {
        int busyDays = 0;
        for(int i =0; i< birdPerDay.length; i++) {
            if(birdPerDay[i] >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }


    int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < numberOfDays; i++) {
            sum += birdPerDay[i];
        }
        return sum;
    }

    boolean hasDaysWithoutBird() {
        boolean hasDaysWithoutBirds = false;
        for (int i = 0; i < birdPerDay.length; i++) {
            if (birdPerDay[i] == 0) {
                hasDaysWithoutBirds = true;
                return hasDaysWithoutBirds;
            }
        }
        return hasDaysWithoutBirds;
    }

    int incrementToday() {
        return getToday() + 1;
    }

    int getToday() {
        return birdPerDay[birdPerDay.length - 1]; // array[6]
    }

}
