package sanduCristianMentor.OOPExcerises;

public interface Counter {
    public static final int count = 10;
    static void print() {
        System.out.println("Counter");
    }
}

class TestMyCounter {
    public static void main(String[] args) {
        Counter [] arr = new Counter[2];
        for(Counter ctr : arr) {
            System.out.println(Counter.count);
            Counter.print();
        }
    }

}