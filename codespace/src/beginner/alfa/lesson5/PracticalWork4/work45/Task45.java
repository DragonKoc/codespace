package beginner.alfa.lesson5.PracticalWork4.work45;

public class Task45 {
    public static void main(String[] args) {
        int [] array1 ={1,2,3,4,5,6,7,8,9};
        int a=0, b=1;

        System.out.println("* | 1 2 3 4 5 6 7 8 9 ");
        System.out.println("______________________");

        while (a<9){
            System.out.print((a+1) +" |");
            while (b<10){
                System.out.print("  "+(array1[a]*b));
                b++;
            }
            b=1;
            a++;

            System.out.println();
        }
    }
}
