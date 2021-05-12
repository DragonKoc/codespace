package advanced.alfa.lesson19_20.work3;

public class Printer implements Runnable {
    Storage storage;

    public Printer(Storage i) {
        this.storage = i;
    }

    @Override
    public void run() {
        System.out.println("стартовал printer");
        synchronized (storage) {
            while (true) {
                try {
                    storage.notify();
                    System.out.println("printer получил " + storage.getI());
                    Thread.sleep(1000);
                    storage.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}}
