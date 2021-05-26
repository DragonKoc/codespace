package advanced.alfa.lesson19_22.work1;

public class MyTimeBomb_1 extends Thread {
    @Override
    public void run() {
        setName("myTimeBomb_1");
        for (int i = 10; i >= 0; i--) {
            try {
                System.out.println(getName() + " i=" + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Boom!");
    }
}
