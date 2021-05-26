package advanced.alfa.lesson19_22.work2;

import java.util.Arrays;
import java.util.Random;

public class Runner {
    public void run(){
        Integer[] arrInt = createArrayInt();
        System.out.println(Arrays.toString(arrInt));
        MySumCount_1 mySumCount_1 = new MySumCount_1();
        mySumCount_1.setStartIndex(1);
        mySumCount_1.setStopIndex(4);
        mySumCount_1.setMyArray(arrInt);
        mySumCount_1.run();
        System.out.println(mySumCount_1.getResultSum());

        MySumCount_2 mySumCount_2 = new MySumCount_2();
        mySumCount_2.setStartIndex(1);
        mySumCount_2.setStopIndex(3);
        mySumCount_2.setMyArray(arrInt);
        mySumCount_2.run();
        System.out.println(mySumCount_2.getResultSum());


    }

    private Integer[] createArrayInt(){
        Random random = new Random();
        Integer[] array = new Integer[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 100 + random.nextInt(1000 - 100 + 1);
        }
        return array;
    }

}
