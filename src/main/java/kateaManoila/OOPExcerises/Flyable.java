package kateaManoila.OOPExcerises;

public interface Flyable {
    static int horizontalDegree(){
        return 20;
    }
    default void  fly(){
        System.out.println("Flying at " +horizontalDegree() +"degrees");
    }
    void land();

}
