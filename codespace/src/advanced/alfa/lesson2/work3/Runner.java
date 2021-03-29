package advanced.alfa.lesson2.work3;

public class Runner {

    public static void run() {

        ID id = new ID();
        ID id1 = new ID();
        ID id2 = new ID();
        ID id3 = new ID();
        ID id4 = new ID();

        ID[] idArray = new ID[]{id, id1, id2, id3, id4};

        ID.view(idArray);
        System.out.println();

    }
}
