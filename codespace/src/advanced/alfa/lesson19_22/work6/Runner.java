package advanced.alfa.lesson19_22.work6;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Runner {
    private static int N = 1000_000;

    public void run(){
        Integer[] arrInt = createArrayInt();
       // System.out.println(Arrays.toString(arrInt));
        System.out.println(printArrayInt(arrInt));

        ForkJoinPool pool = new ForkJoinPool(2);

        long computedSum = pool.invoke(new SumOfNUsingForkJoin.RecSumOfN(0,N));
        long formulaSum = (N*(N+1)) / 2;
        System.out.printf("Sum for range 1..$d; computed sum = $d, formula sum = %d %n", N,computedSum, formulaSum);
    }



    private Integer[] createArrayInt(){
        Random random = new Random();
        Integer[] array = new Integer[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100 - 10 + 1);
        }
        return array;
    }

    private String printArrayInt(Integer[] a){
        return Arrays.toString(a);
    }


}
