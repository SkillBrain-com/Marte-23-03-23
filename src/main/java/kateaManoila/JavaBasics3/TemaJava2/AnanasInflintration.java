package kateaManoila.JavaBasics3.TemaJava2;

public class AnanasInflintration {


    public static void main(String[] args) {

        boolean kinghtIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        boolean petDoPresent = false;

//        System.out.println(canFastAttack( kinghtIsAwake));
//        System.out.println(canSpy(kinghtIsAwake,archerIsAwake,prisonerIsAwake  ));
//        System.out.println(canSignalPrisonier(archerIsAwake, prisonerIsAwake ));
        System.out.println(conFreePrisoner(archerIsAwake, prisonerIsAwake, kinghtIsAwake, petDoPresent));
    }
    static boolean conFreePrisoner(boolean archerIsAwake,
                                   boolean prisonerIsAwake,
                                   boolean kinghtIsAwake,
                                   boolean petDoPresent ) {
        if(petDoPresent && !archerIsAwake){
            return true;
        }else if(petDoPresent && !kinghtIsAwake && !archerIsAwake){
            return true;

        }else {
            return false;
        }


    }


    static boolean canSignalPrisonier(boolean archerIsAwake, boolean  prisonerIsAwake ){
        return (!archerIsAwake && prisonerIsAwake);
    }


    static boolean canSpy(boolean kinghtIsAwake,boolean archerIsAwake,boolean prisonerIsAwake){
        return (kinghtIsAwake || archerIsAwake || prisonerIsAwake);
    }


    static boolean canFastAttack(boolean kinghtIsAwake){
        return !kinghtIsAwake;
    }
}
