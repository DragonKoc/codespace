package beginner.alfa.PracticalWork3.work32;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Введите сумму депозита в тугриках: ");
        int dpz = scan.nextInt ();
        System.out.print ("Введите количество месяцев: ");
        int time = scan.nextInt ();

        int prib = dpz*time/100;
        System.out.println ( "Ваша прибыль составляет: "+ prib+" тугриков" );

    }
}
