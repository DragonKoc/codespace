package advanced.alfa.lesson10.work1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Runner {
    public void run() {
        File file = new File("/Users/dragon/Dev/Github/codespace/codespace/src/advanced/alfa/lesson10/theory/");
        try {
            if (file.list() != null) {
                System.out.println("Файлы в директории: " + file);
                System.out.println(Arrays.toString(file.list()));
            } else {
                throw new IOException("Неверный путь к директории");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
