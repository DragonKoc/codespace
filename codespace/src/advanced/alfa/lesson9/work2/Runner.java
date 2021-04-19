package advanced.alfa.lesson9.work2;

public class Runner {
    public void run(){
        MyNumGenerator myNumGenerator = new MyNumGenerator(3,20);

        System.out.println(myNumGenerator.generateList());
        System.out.println(myNumGenerator.generateSet());
    }
}
