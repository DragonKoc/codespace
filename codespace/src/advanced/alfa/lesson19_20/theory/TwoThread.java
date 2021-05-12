package advanced.alfa.lesson19_20.theory;

import java.io.BufferedReader;

public class TwoThread extends Thread {
    public static void main(String args[]) {
        final StringBuffer s = new StringBuffer();

        Thread thread1 = new TwoThread() {
            public void run() {

                StringBuffer n = new StringBuffer();
                n.append("aaa");
                System.out.println(n);
                try {
                    sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread1.start();

        new Thread() {
            public void run() {
                int i = 0;
                while (i++ < 3) {
                    s.append("A");
                    try {
                        sleep(15);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(s);
                }
            }
        }.start();

        new Thread() {
            public void run() {
                int j = 0;
                while (j++ < 3) {
                    s.append("B");
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(s);
                }
            }
        }.start();
    }
}
