package advanced.alfa.lesson9.work3;

import java.util.HashMap;
import java.util.Scanner;

public class Runner {
    public void run(){
        //имитация переводчика
        //траслятор с полем хешмеп и наполнить его методом парами
        //ключ на английском, переводы - значения
        //метод транслейт возвращает переведнное значение
        //если вы не нашли слово в коллекции вернуть null
        //addwors для одной пары - дальше в цикле
        //начальная пустая создается

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
