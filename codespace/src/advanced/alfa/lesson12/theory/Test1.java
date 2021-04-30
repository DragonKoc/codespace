package advanced.alfa.lesson12.theory;

import java.util.*;
import java.util.stream.Stream;

public class Test1 implements MyFunc{
    public static void main(String[] args) {

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println(names);

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world!");
            }
        };

        Runnable r2 = () -> System.out.println("Hello world!");

        r1.run();
        r2.run();

        int[] arr = {1,2,3,4,5,5,7,8,9};
        System.out.println(MyFunc.testLmb(arr, x -> x + 1));

        Stream<Integer> numStream= Stream.of(1,2,3,4,5,6,7,8,9);
        Optional<Integer> res = numStream
                .reduce((x, y)-> x + y + 1);
        System.out.println(res.get());
       // System.out.println(3 + 7 + 11  + 15  + 9 );
//        System.out.println(3 + 1 + 7 + 1 + 11 + 1 + 15 + 1 + 9 + 1);
    }

    @Override
    public int calc(int x) {
        return 0;
    }
}
