package beginner.alfa.PracticalWork2.work21;

import java.util.Scanner;

public class Task21 {
    public static void main (String [] args){
        Scanner scan  = new Scanner (System.in);
        System.out.print ( "Введите количество недель: " );
        int wk  = scan.nextInt ();
        int sc = 604800*wk;
        System.out.println ( "В " + wk + " неделях " + sc +" секунд" );
    }
}
