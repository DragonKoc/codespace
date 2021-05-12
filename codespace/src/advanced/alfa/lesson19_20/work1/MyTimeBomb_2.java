package advanced.alfa.lesson19_20.work1;

public class MyTimeBomb_2 implements Runnable{

    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(Thread.currentThread().getName() + " i=" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boooooom!");
    }
}
