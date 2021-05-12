package advanced.alfa.lesson19_20.theory;

public class TwoThread_synchro {
    public static void main(String args[]) {
        final StringBuffer s = new StringBuffer();
        new Thread() {
            public void run() {
                int i = 0;
                synchronized (s){
                while (i++ < 3) {
                    s.append("A");
                    try {
                        sleep(15);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(s);
                }
            }}
        }.start();

        new Thread() {
            public void run() {
                int j = 0;
                synchronized (s){
                while (j++ < 3) {
                    s.append("B");
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(s);
                }
            }}
        }.start();
    }
}