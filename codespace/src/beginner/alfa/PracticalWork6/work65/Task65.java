package beginner.alfa.PracticalWork6.work65;

import java.util.Scanner;

/**
 * Добавьте в класс Task65 метод public static void printPyramid(int height),
 * который создает и выводит на консоль пирамиду высотой height (значение в
 * диапазоне от 1 по 9). Например, для height = 4:
 *
 *    1
 *   121
 *  12321
 * 1234321
 *
 * 3. Добавьте в класс Task65 метод public static void main(String[] args),
 * который вводит высоту пирамиды и выводит пирамиду с использованием
 * метода printPyramid().
 */

public class Task65 {

    public static void printPyramid(int height){
        int hei=0, prow=height;

        for (int pr=0; pr<height+1;pr++) {
            for (int p=0; p < prow; p++) {
                System.out.print ( " " );
            }
            prow--;
            for (int i = 1; i < hei; i++) {
                System.out.print ( i );
            }
            for (int j = hei; j > 0; j--) {
                System.out.print ( j );
            }
            hei++;
            System.out.println ();
        }
    }

    public static void main ( String[] args ) {
        Scanner scan = new Scanner (System.in);
        System.out.print ( "Введите высоту пирамиды: " );
        int h = scan.nextInt ();
        printPyramid ( h );
    }
}
