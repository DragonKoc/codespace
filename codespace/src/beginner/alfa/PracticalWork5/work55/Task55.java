package beginner.alfa.PracticalWork5.work55;
/**
 * Добавьте в метод main(...) код, который:
 * − вводит некоторую строку;
 * − выводит в консоль все уникальные (те, которые не повторяются, т.е.
 * присутсвуют в единственном числе) символы этой строки.
 * */
public class Task55 {
    public static void main ( String[] args ) {
        String str = "вводит некоторую строку";
        int i = 0, j = 0, g = 0;

        while (i < str.length ()) {

            while (j < str.length ()) {

                if (str.charAt ( i ) != str.charAt ( j )) {
                    g++;
                    if (g == ( str.length ()-1 )) {
                        System.out.print ( " " + str.charAt ( i ) );
                    }
                }
                j++;
            }
            i++;
            j = 0;
            g = 0;
        }
        System.out.println (  );
    }
}

