package beginner.alfa.lesson5.PracticalWork4.work41;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое  число: ");
        int a = scan.nextInt();
        System.out.print("Введите второе  число: ");
        int b = scan.nextInt();
        System.out.print("Введите третье  число: ");
        int c = scan.nextInt();

        if ( a>b && a>c || a==b || a==c) {
            System.out.println ("Наибольшее число первое: " + a);}
        else if (b>a && b>c || b==c){
            System.out.println ("Наибольшее число второе: " + b);}
        else if (c>a && c>b){
            System.out.println ("Наибольшее число третье: " + c);}
    }
}
