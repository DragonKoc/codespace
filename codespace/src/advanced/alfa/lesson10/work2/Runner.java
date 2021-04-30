package advanced.alfa.lesson10.work2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public void run() throws IOException {
        BufferedReader br = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу: ");
        String fileDestination = scanner.nextLine();
        try {
           // br = new BufferedReader(new FileReader("/Users/dragon/Dev/Github/codespace/codespace/src/advanced/alfa/lesson10/theory/test.txt"));
            br = new BufferedReader(new FileReader(fileDestination));
            InputStream inputLine = new FileInputStream (fileDestination );
            String str;
            int data, i = 0;
            char [] dataOut = new char[9];

            while ((data = inputLine.read())!= -1 ) {
                dataOut[i] = (char) data;
                i++;
            }
            System.out.println(Arrays.toString(dataOut));

            while ((str = br.readLine()) != null)
                System.out.println(str);
                dataOut[i] = (char) data;
              i++;
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
