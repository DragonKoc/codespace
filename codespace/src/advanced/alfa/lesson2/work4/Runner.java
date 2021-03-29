package advanced.alfa.lesson2.work4;

import advanced.alfa.lesson2.work4.calcarea.Calculate;

import java.util.Scanner;

public class Runner {

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        Double radius = scanner.nextDouble();
        System.out.println("Площадь окружности: " + String.format("%.2f", Calculate.areaCircle(radius)));

        System.out.print("Введите сторону квадрата: ");
        int side = scanner.nextInt();
        System.out.println("Площадь квадрата: " + String.format("%.2f", Calculate.areaSquare(side)));

    }
}
