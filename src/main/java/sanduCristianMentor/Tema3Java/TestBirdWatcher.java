package sanduCristianMentor.Tema3Java;

public class TestBirdWatcher {

    public static void main(String[] args) {
        int [] birds = {0, 5, 12, 1, 7, 2, 3};
        BirdWatcher bw = new BirdWatcher(birds);
        System.out.println(bw.getToday());
        System.out.println(bw.getBusyDays());
        System.out.println(bw.getCountForFirstDays(3));
        System.out.println(bw.incrementToday());
        bw.getLastWeek();
    }

}
