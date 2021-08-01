package work72;

import java.util.Arrays;

/**
 * Добавьте в класс Task72 метод public static int sumOddElementsArray(int[]
 * array), который получает массив целых положительных значений и
 * возвращает сумму нечетных элементов этого массива или -1, если с
 * массивом что-то не так.
 *
 * Добавьте в класс Task72 метод public static void main(String[] args),
 * который описывает массив целых положительных чисел, использует метод
 * sumOddElementsArray() и выводит результат его работы.
 * 4. Запустите приложение на исполнение.*/

public class Task72 {
    public static int sumOddElementsArray(int[] array){
            int zn = 0;
        for(int i=0; i<array.length;i++){
            if (array[i]%2!=0){ zn=zn+array[i];} else
            if (array[i]%2==0){ zn=zn+0; } else { zn=-1;}
        }
        return zn;
    }

    public static void main ( String[] args ) {
        int [] arrays = {2, 4, 7, 8, 5, 12, 3, 16, 5, 20, 22, 24, 26, 28, 30};
        System.out.println ( Arrays.toString  ( arrays ) );
        System.out.println ( sumOddElementsArray ( arrays ) );
    }
}

