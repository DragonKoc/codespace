package advanced.alfa.lesson19_20.theory;

public class Main {
    public static void main(String[] args) {
        System.out.println("main start");
        Talk talk = new Talk();
        talk.start();
        System.out.println("main ended!");

        System.out.println("main start");
        Thread myThread= new Thread(new Walk());
        myThread.start();System.out.println("main ended!");

    }
}
