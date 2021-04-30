package advanced.alfa.lesson12.work1_2;

import java.util.*;
import java.util.function.Predicate;

public class Runner {
    public void run(){

//        List<String> listStr = createListString();
//        System.out.println(listStr);
//        Collections.sort(listStr, (s1, s2) -> s2.compareTo(s1));
//        System.out.println(listStr);

        Integer[] arrInt = createArrayInt();
        System.out.println(Arrays.toString(arrInt));
        Arrays.sort(arrInt, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arrInt));
        System.out.println(sum(arrInt, x -> x % 2 == 0));
        System.out.println(sum(arrInt, x -> x % 2 == 1));
        System.out.println(sum(arrInt, x -> x > 0));

    }

    private Integer[] createArrayInt(){
        Random random = new Random();
        Integer[] array = new Integer[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100)-50;
        }
        return array;
    }

    private List<String> createListString(){
        Random random = new Random();
        List<String> stringList = new ArrayList<>();
        String temp = "abbklksfjlsjfijwe";
        for (int i = 0; i < 12; i++) {
            int pos = random.nextInt(temp.length());
            stringList.add(temp.substring(pos,pos+1));
        }
        return stringList;
    }

    private Integer sum(Integer[] arrInt, Predicate<Integer> predicate){
        int sumInt = 0;
        for (Integer element: arrInt) {
            if(predicate.test(element)){
                sumInt += element;
            }
        }
        return sumInt;
    }
}
