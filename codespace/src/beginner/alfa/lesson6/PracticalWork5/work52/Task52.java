package beginner.alfa.lesson6.PracticalWork5.work52;
/**
 * Добавьте в метод main(...) код, в котором:
 * – определяется переменная строкового типа, которая содержит название
 * некоторой организации из трех слов (например, «National Aviation
 * University»);
 * – составляет и сохраняет в переменной аббревиатуру этой организации;
 * – выводит результат в консоль.
 */
import java.util.Scanner;

public class Task52 {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = scan.nextLine();

        char rez0 = str.charAt(str.indexOf('N'));
        char rez1 = str.charAt(str.indexOf('A'));
        char rez2 = str.charAt(str.indexOf('U'));

        String abb= rez0 + "" + rez1 + rez2;

        System.out.println ( abb );

    }
}
