package beginner.alfa.lesson3.PracticalWork2.work24;

import java.util.Scanner;

public class Task24 {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        System.out.print ( "Введите число: " );
        int number = scan.nextInt ();
        int nu = number , obnum = 0;

        while (number!=0){
            obnum = obnum*10+(number % 10);
            number = number/10;
        }

        System.out.println ( "Обратное число: "+obnum );
        int razn = nu - obnum;
        System.out.println ( "Разность чисел = "+razn );
    }
}
