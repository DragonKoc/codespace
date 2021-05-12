package advanced.alfa.lesson19_20.work3;

public class Runner {
    public void run(){
        Storage storage = new Storage();

        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);

        new Thread(printer, "printer").start();
        new Thread(counter, "counter").start();

    }
}
