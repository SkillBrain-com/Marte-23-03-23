package kateaManoila.OOPExcerises;

public interface Sellable {
    double getPrice();

    default String symbol(){
        return "£";
    }
}
