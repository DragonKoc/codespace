package advanced.alfa.lesson19_22.theory;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class Synchro {
    private File f = new File("/Users/dragon/Dev/Github/codespace/codespace/src/advanced/alfa/lesson19_20/theory/data.txt");

    public Synchro() {
        try {
            f.delete();
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writing(String str, int i) {
//        При создании экземпляра всегда удалять предшествующий файл и создавать новый пустой

        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            raf.seek(raf.length());
            System.out.print(str);
            raf.writeBytes(str);
            Thread.sleep((long) (Math.random() * 15));
            System.out.println("->" + i);
            raf.writeBytes("->" + i + " ");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SynchroThreads {
    public static void main(String[] args) {
        Synchro s = new Synchro();
        T t1 = new T("First", s);
        T t2 = new T("Second", s);
        t1.start();
        t2.start();
    }
}

class T extends Thread {
    private String str;
    private Synchro s;

    public T(String str, Synchro s) {
        this.str = str;
        this.s = s;
    }

    public void run() {
        for (int i = 0; i < 5; i++)
            s.writing(str, i);
    }
}
