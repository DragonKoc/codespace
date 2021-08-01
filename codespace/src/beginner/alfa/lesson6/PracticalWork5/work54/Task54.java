package beginner.alfa.lesson6.PracticalWork5.work54;
/**
 * Добавьте в метод main(...) код, который:
 * − описываются две переменные myStr1 и myStr2 типа String (например, со
 * значениями «Cartoon» для первой и «Tomcat» для второй);
 * − выведите в консоль все буквы, которые присутствуют в первом слове,
 * но отсутствуют во втором.*/
public class Task54 {
    public static void main ( String[] args ) {

        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        int i=0, j=0,g=0;

        while (i<myStr1.length ()){

            while (j<myStr2.length ()){

               if (myStr1.charAt ( i ) != myStr2.charAt ( j )) {
                   g++;
                   if (g==(myStr2.length ())) {
                       System.out.print ( " "+myStr1.charAt ( i ) );
                   }
               }
                j++;
            }
            i++;
            j=0;
            g=0;
        }
        System.out.println (  );
    }
}
