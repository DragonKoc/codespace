package beginner.alfa.PracticalWork5.work53;

/**
 * 3. Добавьте в метод main(...) код, в котором:
 * − определяется переменная строкового типа, содержащая несколько
 * слов (например, «An information system is designed to collect, process,
 * store and distribute information»);
 * – меняются местами первое и последнее слова этой строки;
 * – выводится результат в консоль.
*/
public class Task53 {
    public static void main ( String[] args ) {
        String str = "An information system is designed to collect, process, store and distribute information";

        String stringFirst = str.substring ( 0, str.indexOf(' ')  );
        String stringLast = str.substring ( str.lastIndexOf ( ' ' )+1 );
        String stringmiddle = str.substring ( str.indexOf(' '), str.lastIndexOf ( ' ' )+1 );

        System.out.println ( stringLast + stringmiddle + stringFirst);
    }
}
