package FayedMustafa.OOPExcersises;

public interface Sellable {
    double getPrice();

    default String symbol(){
        return "$";

    }
}

