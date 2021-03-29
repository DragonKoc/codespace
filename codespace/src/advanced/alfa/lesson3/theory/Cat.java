package advanced.alfa.lesson3.theory;

public class Cat {
    public void move(){
        System.out.println("Cat move");
    }

    static class BritishCat extends Cat{
        @Override
    public void move(){
            System.out.println("Brit move");
        }
}

    static class PersianhCat extends Cat{
        @Override
        public void move(){
            System.out.println("Pers move");
        }
    }

    public static void main(String[] args) {
        Cat[] myCats = {new Cat(), new BritishCat(), new PersianhCat()};
        for (Cat cat : myCats){
            cat.move();
        }
    }
}


