package beginner.alfa.PracticalWork4.work42;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();

        /*
        if (a == 1) {
            System.out.print("Один ");
        } else if (a == 2) {
            System.out.print("Два ");
        } else if (a == 3) {
            System.out.print("Три ");
        } else if (a == 4) {
            System.out.print("Четыре ");
        } else if (a == 5) {
            System.out.print("Пять ");
        } else if (a == 6) {
            System.out.print("Шесть ");
        } else if (a == 7) {
            System.out.print("Семь ");
        } else if (a == 8) {
            System.out.print("Восемь ");
        } else if (a == 9) {
            System.out.print("Девять ");
        } else if (a < 1 || a > 9) {
            System.out.print("Другое ");
        }
        System.out.println();
        */

        
        String num = null;
        switch (a){
            case 1: num = "Один";
                break;
            case 2: num = "Два";
                break;
            case 3: num = "Три";
                break;
            case 4: num = "Четыре";
                break;
            case 5: num = "Пять";
                break;
            case 6: num = "Шесть";
                break;
            case 7: num = "Семь";
                break;
            case 8: num = "Восемь";
                break;
            case 9: num = "Девять";
                break;
            default: num = "Другое";
                break;

        }

        System.out.println (num);
    }
}
