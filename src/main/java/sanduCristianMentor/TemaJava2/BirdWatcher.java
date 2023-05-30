package sanduCristianMentor.TemaJava2;

public class BirdWatcher {


    public static void main(String[] args) {
        int[] birdsPerDay = {3, 2, 5, 0, 7, 8, 5};
        getLastWeek(birdsPerDay);
        System.out.println(getToday(birdsPerDay));
        System.out.println(incrementToday(birdsPerDay));
        System.out.println(hasDaysWithoutBird(birdsPerDay));
        System.out.println(getCountForFirstDays(birdsPerDay, 5));
        System.out.println(getBusyDays(birdsPerDay));
    }

    static int getBusyDays(int[] array) {
        int busyDays = 0;
        for(int i =0; i< array.length; i++) {
            if(array[i] >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }


    static int getCountForFirstDays(int[] array, int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < numberOfDays; i++) {
            sum += array[i];
        }
        return sum;
    }

    static boolean hasDaysWithoutBird(int[] array) {
        boolean hasDaysWithoutBirds = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                hasDaysWithoutBirds = true;
                return hasDaysWithoutBirds;
            }
        }
        return hasDaysWithoutBirds;
    }


//    static int incrementToday(int[] array) {
//        int today = getToday(array);
//        return ++today;
//    }

    static int incrementToday(int[] array) {
        return getToday(array) + 1;
    }

    static int getToday(int[] array) {
        return array[array.length - 1]; // array[6]
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


}
