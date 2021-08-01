package beginner.alfa.lesson5.PracticalWork4.work44;

public class Task44 {
    public static void main(String[] args) {
        int a=3;
        int b = 0;

        while (300 > a){
            if (a%3==0 || a%4==0){
                System.out.println(a);
                b++;
                if (b==10){break;}
            }
            a++;
        }

    }
}
