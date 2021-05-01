package advanced.alfa.lesson14_15.theory;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        InputStream stdin = System.in;
//        int val = stdin.read();
//        System.out.println(val);

        DataInputStream din = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("/Users/dragon/Dev/Github/codespace/codespace/src/advanced/alfa/lesson10/theory/test.txt")
                )
        );

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("go");
        do{
            str = br.readLine();
            System.out.println(str);
        }
        while (!str.toLowerCase().equals("stop"));

        BufferedReader br1 = null;
        try{
            br1 = new BufferedReader(new FileReader("/Users/dragon/Dev/Github/codespace/codespace/src/advanced/alfa/lesson10/theory/test.txt"));
            String str1;
            while ((str1 = br1.readLine()) != null)
                System.out.println(str1);
        } finally {
            if (br1 != null)
                br1.close();
        }

    }
}
