package kateaManoila.JavaBasisc2;

public class Aha {


    public static void main(String[] args) {
        boolean innerLoopTrue = true;

        while(true) {
            int z = 0 ;
            while(innerLoopTrue) {
                if(z >= 10){
                    innerLoopTrue = false;
                    break;

                }else{
                    System .out. println(z ++);

                }
            }
            break;
        }
    }
}
