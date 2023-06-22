package org.skillbrain;

public class ExceptionMaterial {


    public static void main(String[] args)  {


        try {
            System.out.println("trying to executed code");
            System.out.println("Executing code...");
           throw new InterruptedException("Process was interrupted");


        }catch (Exception e){
            System.out.println("Something wont wrong,please check " +
                    "exception details below");
            e.printStackTrace();

        }
    }
}
