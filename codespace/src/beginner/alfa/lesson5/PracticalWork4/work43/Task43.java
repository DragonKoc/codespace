package beginner.alfa.lesson5.PracticalWork4.work43;

public class Task43 {
    public static void main(String[] args) {
        int [] array = {8,7,6,5,4,3,2,1};
        int a, b = 7;

        while (b>=0) {
            a=b;
            while (a <= 7) {
                System.out.print(array[a]);
                System.out.print(" ");
                a++;
            }
            System.out.println();
            b--;
        }
        System.out.println();
    }
}
