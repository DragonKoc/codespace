package advanced.alfa.lesson2.work1;

import java.util.Scanner;

public class Runner {


    public static void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество итераций для вычисления числа Пи: ");
        int rowElement = scanner.nextInt();
        System.out.println("Число Пи=      " + MyCalculate.calcPi(rowElement));
        System.out.println("Число Math Пи= " + Math.PI);


    }
}
