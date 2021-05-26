package advanced.alfa.lesson19_22.theory;

public class Talk extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.print(this.getName() + ": ");
            System.out.println("Talking " + (i+1));
        }
    }
}

