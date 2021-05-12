package advanced.alfa.lesson19_20.theory;

public class MyThread3 extends Thread {
    public void run() {
        int i = 1;
        while (!isInterrupted()) {
            System.out.println("Thread:" + getName() + " i=" + i++);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
