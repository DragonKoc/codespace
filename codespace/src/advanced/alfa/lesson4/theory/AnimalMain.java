package advanced.alfa.lesson4.theory;

class Reptilies extends Animal implements BehaviorAnimal {

    @Override
    public void move() {
        System.out.println("Go!");
    }

    @Override
    public void preen() {
        System.out.println("animal");
    }
}

public class AnimalMain {

    public static void main(String[] args) {
        Reptilies reptilies = new Reptilies();
        reptilies.move();
        reptilies.preen();
    }
}
