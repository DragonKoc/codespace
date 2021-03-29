package work71;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Добавьте в класс Task71 метод public static int[] createArray(int size),
 * создает массив четных чисел, начиная с 2, размерностью size.
 *
 * Добавьте в класс Task71 метод public static void main(String[] args),
 * который вводит количество элементов массива, создает массив, используя
 * метод createArray() и выводит его в консоль.*/

public class Task71 {

    public static int [] createArray (int size){
      int [] array = new int[size];
      for (int i =0; i<array.length;i++){
          array [i] = (i*2)+2;
      }
      return array;
    }

    public static void main ( String[] args ) {

        Scanner scan = new Scanner ( System.in );
        System.out.print ( "Введите количество элементов массива: " );
        int sizeArray = scan.nextInt ();
        System.out.println ( Arrays.toString (createArray ( sizeArray )));
    }
}
