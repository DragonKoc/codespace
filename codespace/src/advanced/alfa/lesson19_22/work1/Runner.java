package advanced.alfa.lesson19_22.work1;

public class Runner {
    public void run() throws InterruptedException {
        MyTimeBomb_1 myTimeBomb_1 = new MyTimeBomb_1();
        MyTimeBomb_2 myTimeBomb_2 = new MyTimeBomb_2();

//        myTimeBomb_1.start();
//        myTimeBomb_2.run();

        myTimeBomb_1.run();
        Thread thread_bomb2 = new Thread(myTimeBomb_2, "myTimeBomb_2");
        thread_bomb2.join();
        thread_bomb2.start();

    }
}
