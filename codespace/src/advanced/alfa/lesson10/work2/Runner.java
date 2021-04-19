package advanced.alfa.lesson10.work2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public void run() throws IOException {
        BufferedReader br = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу: ");
        String fileDestination = scanner.nextLine();
        try {
//            br = new BufferedReader(new FileReader("/Users/dragon/Dev/Github/codespace/codespace/src/advanced/alfa/lesson10/theory/test.txt"));
            br = new BufferedReader(new FileReader(fileDestination));
            String str;
            while ((str = br.readLine()) != null)
                System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null)
                br.close();
        }
    }
}
