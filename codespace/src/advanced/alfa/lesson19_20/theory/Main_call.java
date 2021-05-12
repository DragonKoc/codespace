package advanced.alfa.lesson19_20.theory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main_call {
    public static void main(String[] args) {
        int numOfWorks = 20;
        ExecutorService pool = Executors.newFixedThreadPool(4);
        MyTestCallable works[] = new MyTestCallable[numOfWorks];
        Future[] futures = new Future[numOfWorks];
        for (int i = 0; i < numOfWorks; ++i) {
            works[i] = new MyTestCallable(i + 1);
            futures[i] = pool.submit(works[i]);
        }
        for (int i = 0; i < numOfWorks; ++i) {
            try {
                System.out.println(futures[i].get() + " ended");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
}
