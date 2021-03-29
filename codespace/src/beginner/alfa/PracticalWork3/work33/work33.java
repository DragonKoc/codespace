package beginner.alfa.PracticalWork3.work33;

import java.util.Scanner;

public class work33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Введите изначальную стоимость итальянского шкафа  (830): ");
        double cupB = scan.nextDouble ();

        System.out.print ("На сколько цена упала (13%): ");
        double cenLow = scan.nextDouble ();

        System.out.print ("На сколько вырос курс (7%): ");
        double dollUp = scan.nextDouble ();

        double cenaLow = (cupB-(cupB*cenLow)/100) ;
        double cena = (cenaLow*dollUp/100)+cenaLow;
        System.out.println ( "Конечная цена шкафа составляет: "+cena );
    }
}
