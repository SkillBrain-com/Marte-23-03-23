package org.skillbrain;

public class ExceptionsTutorial {
    public static void main(String[] args)  {

      try{
          System.out.println("Try to exectute code");
          System.out.println("Executing code...");
          throw new InterruptedException("Process was interrupted");



      } catch(Exception e){
          System.out.println("Something went wrong, please check " +
                  "exception details below");
          e.printStackTrace();

      }


    }




}
