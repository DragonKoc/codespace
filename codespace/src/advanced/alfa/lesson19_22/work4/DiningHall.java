package advanced.alfa.lesson19_22.work4;

public class DiningHall implements Runnable{
    static int pizzaNum;
//    private final static AtomicInteger studentID = new AtomicInteger(1);
    static int studentID = 1;

    public void makePizza() {
        pizzaNum++;
    }

    public synchronized void servePizza() {
        String result;

        if (pizzaNum > 0) {
            result = "Served ";
            pizzaNum--;
        } else {
            result = "Starved ";
        }
        System.out.println(result + studentID + " " + Thread.currentThread().getName());
        studentID++;
    }


    @Override
    public void run() {
        servePizza();
    }
}
