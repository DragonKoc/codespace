package advanced.alfa.lesson19_22.theory;

public class MyThread extends Thread {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread:" + getName() + " i=" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
