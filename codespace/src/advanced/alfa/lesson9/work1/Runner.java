package advanced.alfa.lesson9.work1;

import java.util.*;

public class Runner {

    public void run() {
        List<String> listArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listArray.add("number_" + i);
        }
        System.out.println("listArray\n" + listArray);

        List<String> listLink = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            listLink.add("num_" + i);
        }
        System.out.println("listLink\n" + listLink);

        //7
//        for (int i = 0;  i < listArray.size()-1; i++) {
//            int b = (int) (Math.random()*10);
//            listLink.add (b, listArray.get(i));

        ListIterator<String> stringListIterator = listArray.listIterator(listArray.size());
        ListIterator<String> listIterator = listLink.listIterator();

        while (listIterator.hasNext() && stringListIterator.hasPrevious()) {
            listIterator.add(stringListIterator.previous());
            listIterator.next();
        }

        System.out.println("new listLink\n" + listLink);
    }

}
