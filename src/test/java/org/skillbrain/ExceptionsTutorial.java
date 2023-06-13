package org.skillbrain;

public class ExceptionsTutorial {


    public static void main(String[] args){

        try {
            System.out.println("Trying to executed code");
            System.out.println("Executing code...");
            throwIllegalAccessException();
            System.out.println("Test finished");


        } catch (Exception e) {
            System.out.println("Something went wrong, please check " +
                    "exception details below");
            e.printStackTrace();
        }

    }


    public static void throwIllegalAccessException() throws IllegalAccessException {
        throw new IllegalAccessException("Throwing illegal access exception");
    }





}
