package beginner.alfa.lesson7_8.PracticalWork6.work64;

import java.util.Scanner;

/**
 * Добавьте в класс Task64 метод public static String
 * convertDecimalToBinary(int number), который получает некоторое целое
 * положительное число number, преобразует его в двоичное число и
 * возвращает в виде строки символов.
 *
 * Добавьте в класс Task64 метод public static void main(String[] args),
 * который вводит целое число и выводит результат его обработки методом
 * convertDecimalToBinary().
 * */
public class Task64 {

    public static String convertDecimalToBinary (int number) {
        long obnum =0, bon=0;
        while (number!=0){
            obnum = obnum*10+(number % 2);
            number = number/2;
        }
        while (obnum!=0){
            bon = bon*10+(obnum % 10);
            obnum = obnum/10;
        }
        String obn = String.valueOf ( bon );
        return obn;
    }

    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        System.out.print ( "Введите число: " );
        int binar = scan.nextInt ();
        System.out.println ( "Это число в двоичной системе: "+ convertDecimalToBinary ( binar ) );// правда, теряется послендний 0 :(
    }
}
