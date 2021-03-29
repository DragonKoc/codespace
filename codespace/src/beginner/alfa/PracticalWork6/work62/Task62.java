package beginner.alfa.PracticalWork6.work62;

/**
 * Добавьте в класс Task62 метод public static String latestDigit(int number),
 * который получает целое число, определяет две последние цифры и
 * возвращает их в виде строки символов в обратном порядке.
 *
 * Добавьте в класс Task62 метод public static void main(String[] args),
 * который вводит переменную целого типа и выводит результат ее
 * обработки методом latestDigit().*/
import java.util.Scanner;

public class Task62 {

    public static String latestDigit (int number){
        int obnum =0;
        while (number!=0){
            obnum = obnum*10+(number % 10);
            number = number/10;
        }
        String numS = String.valueOf (obnum);
        String num = numS.substring (0,2);
        return num;
    }

    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        System.out.print ( "Введите число: " );
        int sa = scan.nextInt ();
        System.out.println ( latestDigit ( sa ) );
    }

}
