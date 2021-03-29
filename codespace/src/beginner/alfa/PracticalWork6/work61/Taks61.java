package beginner.alfa.PracticalWork6.work61;

import java.util.Scanner;

/**
 * Добавьте в класс Task61 метод public static double areaTriangle(double a,
 * double b, double c), который вычисляет и возвращает значение площади
 * треугольника по формуле Герона:
 * p ( p − a)( p − b)( p − c)
 * , где a, b, c – стороны треугольника, p – полупериметр.
 *
 * Добавьте в класс Task61 метод public static void main(String[] args),
 * который:
 * − вводит значения сторон треугольника и выводит площадь
 * треугольника, используя метод areaTriangle().*/

public class Taks61 {

    public static double areaTriangle ( double a, double b, double c){
        double p = (a+b+c)/2;
        double s = Math.sqrt ( p * ( p - a ) * ( p - b ) * ( p - c ) );

        return s;
    }


    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        System.out.print ( "Введите сторону A: " );
        double sa = scan.nextDouble ();
        System.out.print ( "Введите сторону B: " );
        double sb = scan.nextDouble ();
        System.out.print ( "Введите сторону C: " );
        double sc = scan.nextDouble ();

       System.out.println ( "Площадь треугольника = "+String.format("%.2f", areaTriangle ( sa,sb,sc )) );

    }
}
