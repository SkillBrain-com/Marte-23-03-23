package sanduCristianMentor.OOPExcerises;

public class Chair implements Sellable {
    @Override
    public double getPrice() {
        return 35;
    }
    @Override
    public String symbol() {
        return "$";
    }
}
class TestChair {
    public static void main(String[] args) {
        Sellable chair = new Chair();
        System.out.println(chair.symbol() + chair.getPrice());

    }

}