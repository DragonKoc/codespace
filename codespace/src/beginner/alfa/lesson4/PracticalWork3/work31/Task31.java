package beginner.alfa.lesson4.PracticalWork3.work31;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Введите вес: ");
        int funt = scan.nextInt ();
        double kg = (funt/2.2046);
        double gr = kg*1000;
        System.out.println ("В "+ funt+" фунте "+String.format ( "%3.1f", kg)+" киллограм, а это " +String.format ( "%3.1f", gr)+" грамм");
    }
}
