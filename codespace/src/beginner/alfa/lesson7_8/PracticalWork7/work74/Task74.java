package work74;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Добавьте в класс Task74 метод public static void transpositionMatrix(int[][]
 * matrix), который выполняет транспонирование матрицы.
 *
 * Добавьте в класс Task74 метод public static int[][] createMatrix(int size),
 * который создает матрицу размером size на size и инициализирует ее
 * случайными значениями.
 *
 * Добавьте в класс Task74 метод public static void printMatrix(int[][] matrix),
 * который выводит матрицу.
 *
 * Добавьте в класс Task74 метод public static void main(String[] args),
 * который вводит размерность матрицы, создает ее, затем отображает, затем
 * транспонирует и снова отображает.
 */
public class Task74 {

    public static int[][] transpositionMatrix( int[][] matrix){
        int [] [] array = new int [matrix.length][matrix.length];
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                array [i] [j] = matrix [j] [i];
            }
        }
        return array;
    }

   public static int[][] createMatrix(int size){
        int [][] matrix = new int [size][size];
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]= (int) (Math.random ()*50);
            }
        }
        return matrix;
   }

    public static void printMatrix(int[][] matrix){
        for (int i=0; i<matrix.length;i++){
            System.out.println ( Arrays.toString ( matrix[i] ));
        }
        System.out.println ();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner ( System.in );
        System.out.print ( "Введите размерность матрицы: " );
        int sizeArray = scan.nextInt ();
        int [][] mar;
        printMatrix ( mar = createMatrix ( sizeArray ));
        printMatrix ( transpositionMatrix (mar) );
    }
}
