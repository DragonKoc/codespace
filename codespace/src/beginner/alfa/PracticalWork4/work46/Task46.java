package beginner.alfa.PracticalWork4.work46;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int ch = scan.nextInt();
        int ot1 = 0, ot2=0;
        while (ch%10>0){
           ot2 = ch%10;
           ot1 = ot1+(ot2*ot2);
           ch =ch/10;
        }
        System.out.println(ot1);



    }
}
