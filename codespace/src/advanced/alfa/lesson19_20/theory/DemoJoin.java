package advanced.alfa.lesson19_20.theory;

public class DemoJoin {
    public static void main(String[] args) {
        System.out.println("main method start");
        MyThread1 thr1 = new MyThread1();
        thr1.start();
        System.out.println("thread started"); try {
            thr1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main method end"); }
}
