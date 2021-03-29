package advanced.alfa.lesson2.work1;

public class MyCalculate {

    public static double calcPi(int rowElement) {

        Double pi = 0.0;
        int value = 1;

        for (int i = 0; i < rowElement; i++) {
            if (i % 2 == 0) {
                pi += 4.0 / value;
            } else {
                pi -= 4.0 / value;
            }
            value += 2;
        }

        return pi;
    }


}
