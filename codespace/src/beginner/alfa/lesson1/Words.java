package beginner.alfa.lesson1;

import java.util.Random;


public class Words {
    public static void a(){ System.out.print("---------\n    *    \n   * *\n  *   *\n ******* \n*       *\n---------"); }


    public static void j(){ System.out.print("---------\n        *\n        *\n        *\n *      *\n  ******\n---------"); }


    public static void v(){ System.out.print("---------\n*       *\n *     *\n  *   *\n   * *\n    *\n---------"); }

    public static int random(){
        Random r = new Random();
        int a = r.nextInt(3) + 1;
        return a;
    }

    public static void main(String[] args) {
        int you = random();
        System.out.println("you");

        switch(you){
            case 1: a();   break;
            case 2: j();   break;
            case 3: v();   break;
        }

    }
}
