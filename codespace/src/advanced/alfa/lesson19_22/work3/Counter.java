package advanced.alfa.lesson19_22.work3;

public class Counter implements Runnable {
    Storage storage;

    public Counter(Storage i) {
        this.storage = i;
    }

    @Override
    public void run() {
        System.out.println("стартовал counter");
        synchronized (storage) {
            for (int i = 1; i < 1000; i++) {
                try {
                    storage.notify();
                    storage.setI(i);
                    System.out.println("counter увеличил " + storage.getI());
                    Thread.sleep(1000);
                    storage.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
