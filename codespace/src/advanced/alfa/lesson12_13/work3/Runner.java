package advanced.alfa.lesson12_13.work3;

import java.util.Scanner;

public class Runner {
    public void run(){
        //имитация переводчика

        MyTranslator myTranslator = new MyTranslator();
        Scanner scanner = new Scanner ( System.in );
        System.out.print("Сколько слов добавлять? ");
        int value = scanner.nextInt ();
        scanner.nextLine ();
        for (int i = 0; i < value; i++) {
           myTranslator.addWords();
        }

        System.out.print ("Ввод фразы на английском языке " );
        String str = scanner.nextLine ();
        System.out.println(myTranslator.translate(str));
    }
}
