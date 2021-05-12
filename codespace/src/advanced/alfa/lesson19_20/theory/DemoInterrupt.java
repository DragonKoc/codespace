package advanced.alfa.lesson19_20.theory;

public class DemoInterrupt {
    public static void main(String[] args) {
        MyThread3 th1 = new MyThread3();
        th1.start();
        try {
            Thread.sleep(5000); //Уступить процессорное время запущенному потоку
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th1.interrupt(); //Прервать поток
    }
}
