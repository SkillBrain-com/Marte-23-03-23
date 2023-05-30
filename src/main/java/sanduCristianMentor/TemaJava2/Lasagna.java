package sanduCristianMentor.TemaJava2;

public class Lasagna {

    public static void main(String[] args) {
//        remainingMinutesInOven(30);
//        preparationTimeInMinutes(2);
        int totalTime = totalPreparationTimeInMinutes(3, 20);
        System.out.println("Total time in preparation " + totalTime);
    }

    static int totalPreparationTimeInMinutes(int layers, int timeInOven) {
        return preparationTimeInMinutes(layers) + remainingMinutesInOven(timeInOven);
    }

    static int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    static int expectedMinutesInOven() {
        return 40;
    }
    static int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }






}
