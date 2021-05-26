package advanced.alfa.lesson19_22.theory;

import java.util.concurrent.Callable;

public class MyTestCallable implements Callable<String> { private int workNumber;

    MyTestCallable(int workNumber) { this.workNumber = workNumber;
    }
    public String call() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Work" + workNumber + ": " + i); try {
                Thread.sleep((int) (Math.random() * 1000)); } catch (InterruptedException e) { }
        }
        return "work " + workNumber; }
}
