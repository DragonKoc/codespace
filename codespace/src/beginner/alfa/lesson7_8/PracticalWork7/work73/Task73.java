package work73;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Добавьте в класс Task73 метод public static int[][] createMatrix(int size),
 * который создает матрицу размером size на size и инициализирует ее
 * числами, начиная с 1, двигаясь по столбцам.
 *
 * Добавьте в класс Task73 метод public static void printMatrix(int[][] matrix),
 * который выводит матрицу.
 *
 * Добавьте в класс Task73 метод public static void main(String[] args),
 * который вводит размерность матрицы, создает ее и затем отображает.*/
public class Task73 {

    public static int[][] createMatrix(int size){
        int [][] array = new int[size][size];
        int s =1;
        for (int i=0; i<array.length;i++){
            for (int j=0; j<array.length;j++){
                array[j][i]=s++;
            }
        }
        return array;
    }

    public static void printMatrix(int[][] matrix){
        for (int i=0; i<matrix.length;i++){
            System.out.println ( Arrays.toString ( matrix[i] ));
        }
        System.out.println ();
    }

    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        System.out.print ( "Введите размерность матрицы: " );
        int sizeArray = scan.nextInt ();
        printMatrix (createMatrix ( sizeArray ));
    }
}
