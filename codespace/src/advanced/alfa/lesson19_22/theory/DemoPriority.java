package advanced.alfa.lesson19_22.theory;

public class DemoPriority {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 min_thr = new MyThread2();
        min_thr.setName("Thread Min");
        min_thr.setPriority(Thread.MIN_PRIORITY);
        MyThread2 max_thr = new MyThread2();
        max_thr.setName("Thread Max");
        max_thr.setPriority(Thread.MAX_PRIORITY);
        MyThread2 norm_thr = new MyThread2();
        norm_thr.setName("Thread Norm");
        norm_thr.setPriority(Thread.NORM_PRIORITY);
        min_thr.start();
        norm_thr.start();
        max_thr.start();
    }
}