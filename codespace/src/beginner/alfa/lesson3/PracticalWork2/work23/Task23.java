package beginner.alfa.lesson3.PracticalWork2.work23;

import java.util.Scanner;

public class Task23 {
    public static void main (String [] args){
        Scanner scan = new Scanner ( System.in );
        System.out.print ( "Введите первое число: " );
        int one = scan.nextInt ();
        System.out.print ( "Введите второе число: " );
        int two = scan.nextInt ();

        one = one+two-(two=one);

        System.out.println ( "Первое число: " +one);
        System.out.println ( "Второе число: " +two);
    }
}
