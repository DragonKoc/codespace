package beginner.alfa.lesson1;

import java.util.Scanner;

public class D2501 {
    String a = "ping";

    public D2501(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String output = "";

    public String input(String b){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite text:");
        b = scanner.nextLine();
        System.out.println(b);
        return b;
    }

    public static void main(String[] args) {
        D2501 test1 = new D2501("Hello student!");
        System.out.println(test1.a);

        System.out.println("Input text:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        System.out.println("Your input text:");
        System.out.println(line);

        System.out.println(test1.output);
        //#2
        test1.getA();
        test1.setA("Good Bye!");
        System.out.println("new text:"+test1.getA());
    }
}
