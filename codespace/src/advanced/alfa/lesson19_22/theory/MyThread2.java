package advanced.alfa.lesson19_22.theory;

public class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 4; i++)
            System.out.println("Thread:" + getName() + " i=" + i);
    }
}
