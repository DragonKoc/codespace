package advanced.alfa.lesson2.work3;

import java.util.Random;

public class ID {

    static int id;
    static int nextId;

    private static int random() {
        Random random = new Random();
        nextId = random.nextInt(100);
        return nextId;
    }

    public ID() {
    }

    public static void view(ID[] idarray) {
        id = random();
        for (int i = 0; i < idarray.length; i++) {
            System.out.println("ID: " + id++);
        }
    }
}


