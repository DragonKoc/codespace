package work75;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Добавьте в класс Task75 метод public static int[]
 * countOfSequenceNumbers(String numbers), который получает
 * последовательность цифр numbers в виде строки символов (символы из
 * диапазона ['1'– '9']) и подсчитывает в этой последовательности количество
 * единиц, количество двоек, количество троек и т.д., записывая их в массив.
 *
 * Добавьте в класс Task75 метод public static void main(String[] args),
 * который вводит строку цифровых символов, обрабатывает ее методом
 * countOfSequenceNumbers() и выводит результат.
 */

public class Task75 {
    public static int[] countOfSequenceNumbers(String numbers){
        int [] str = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] quan = new int[9];
        int ch1=0,ch2=0,ch3=0,ch4=0,ch5=0,ch6=0,ch7=0,ch8=0,ch9=0, chs = 0;

        for(int i=0;i<str.length;i++){
            if (str[i]==1){quan[0]=++ch1;}else
            if (str[i]==2){quan[1]=++ch2;}else
            if (str[i]==3){quan[2]=++ch3;}else
            if (str[i]==4){quan[3]=++ch4;}else
            if (str[i]==5){quan[4]=++ch5;}else
            if (str[i]==6){quan[5]=++ch6;}else
            if (str[i]==7){quan[6]=++ch7;}else
            if (str[i]==8){quan[7]=++ch8;}else
            if (str[i]==9){quan[8]=++ch9;} else { chs++;}
        }
        return quan;
    }

    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        System.out.print ( "Введите строку цифровых символов: " ); //1 4 5 4 5 6 5 4 8
        String stroka = scan.nextLine ();
        System.out.println (Arrays.toString (countOfSequenceNumbers (stroka)));
    }
}
