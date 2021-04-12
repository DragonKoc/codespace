package advanced.alfa.lesson8.work12;

public class Runner {
    public void run(){
        //1
        Integer[] inArray = {4,23,0,89,-23,11,45,-77};
        System.out.println(MyTestMethod.<Integer>calcNum(inArray, 0));

        System.out.println(MyTestMethod.calcNum(
                new Double[] {1.1,-9.0,7.2,6.6,-0.5,11.1}, 0.0
        ));

        System.out.println(MyTestMethod.calcNum(
                new String[] {"asdf","qwerty","texxxx", "pop","cat"}, "text"
        ));

        //2
        System.out.printf("%.2f%n", MyTestMethod.calcSum(new Double[] {1.1,-9.0,7.2,6.6,-0.5,11.1}, 0.0));

        System.out.printf("%.2f%n", MyTestMethod.<Integer>calcSum(new Integer[] {4,23,0,89,-23,11,45,-77}, 0));


    }
}
