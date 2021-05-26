package advanced.alfa.lesson19_22.theory;

public class VolatileTest {
    private static int varVolat = 0;
    private static int varNonVolat = 0;

//    volatile
//    Поток, отслеживающий изменения в переменных
    public static void main(String[] args) {
        ChangeListener thread1 = new ChangeListener();
        ChangeMaker thread2 = new ChangeMaker();
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        thread1.interrupt();
        thread2.interrupt();
    }

    static class ChangeMaker extends Thread {
        @Override
        public void run() {
            int local_value = 0;
            while (!isInterrupted()) {
                varVolat = varNonVolat = ++local_value;
            }
        }
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                if (varVolat != varNonVolat) {
                    System.out.println("Error: " + varVolat + " != " + varNonVolat);
                }
            }
        }
    }
}
