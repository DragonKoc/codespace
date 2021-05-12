package advanced.alfa.lesson19_20.theory;

public class Main {
    public static void main(String[] args) {
        //Talk
        System.out.println("main start Talk");
        Talk talk = new Talk();
        talk.start();
        System.out.println("main ended! Talk");

        //Walk
        System.out.println("main start Walk");
        Thread myThread= new Thread(new Walk());
        myThread.start();
        System.out.println("main ended! Walk");

    }
}
