package advanced.alfa.lesson19_20.theory;

public class Walk implements Runnable{
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i= 0; i< 5; i++)
        {System.out.println(name + ": Walking "+ (i+1)) ;}
    }
}
