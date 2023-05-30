package sanduCristianMentor.TemaJava2;

public class AnanasInflintration {


    public static void main(String[] args) {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;
        System.out.println(canFastAttack(knightIsAwake));
        System.out.println(canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
        System.out.println(canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        System.out.println(canFreePrisoner(archerIsAwake, prisonerIsAwake, knightIsAwake, petDogIsPresent));
    }

    static boolean canFreePrisoner(boolean archerIsAwake,
                                   boolean prisonerIsAwake,
                                   boolean knightIsAwake,
                                   boolean petDogIsPresent) {
        if (petDogIsPresent && !archerIsAwake) {
            return true;
        } else if (prisonerIsAwake && !knightIsAwake && !archerIsAwake) {
            return true;
        } else {
            return false;
        }
    }

    static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return (!archerIsAwake && prisonerIsAwake);
    }

    static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake || archerIsAwake || prisonerIsAwake);
    }

    static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

}