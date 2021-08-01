package beginner.alfa.lesson7_8.PracticalWork6.work63;

import java.util.Scanner;

/**
 * Добавьте в класс Task63 метод public static char
 * getFirstCharacterOfWord(String str, int numberWord), который определяет и
 * возвращает первый символ слова под номером numberWord в строке str, в
 * которой слова разделены только пробелами.
 *
 * Добавьте в класс Task63 метод public static void main(String[] args),
 * который вводит необходимые данные и выводит результат выполнения
 * метода getFirstCharacterOfWord().*/
public class Task63 {
    public static char getFirstCharacterOfWord (String str, int numberWord){
        String [] words = str.split("\\s");
        char subStr = words [numberWord]. charAt ( 0 );
        return subStr;
    }

    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        System.out.print ( "Введите текст: " );
        String string = scan.nextLine ();
        System.out.print ( "Введите номер слова: ");
        int num = scan.nextInt ();
        System.out.println ( "Первый символ слова: "+getFirstCharacterOfWord ( string, num ));
    }
}
