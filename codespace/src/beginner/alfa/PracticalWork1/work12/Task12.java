package beginner.alfa.PracticalWork1.work12;

import java.util.Scanner;

public class Task12 {
    public  static void main (String [] args){
        Scanner scan = new Scanner ( System.in);
        System.out.print ( "Введите свое имя: " );
        String name = scan.nextLine ();
        System.out.println ( "Меня зовут " + name );
    }
}
