package beginner.alfa.PracticalWork5.work51;
/**
 * Добавьте в метод main(...) код, который:
 * − задает некоторую строку str (например, «The decimal system, invented in
 * India around AD 600, was a revolution in quantitative reasoning: using
 * only 10 symbols, even very large numbers could be written down
 * compactly»);
 * − выводит в консоль вторую ее половину.
 * */
import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = scan.nextLine();
        System.out.println("Возвращаемое значение: " + str.substring(str.length()/2));
    }
}
