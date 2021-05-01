package advanced.alfa.lesson11.work12;

public class MyTestMethod {
    public static <T extends  Comparable> int calcNum(T[] array, T value){
        int count = 0;
        for (T elem: array   ) {
            if (elem.compareTo(value) > 0){
                count++;
            }
        }
        return count;
    }


    public static <T extends Number & Comparable> Double calcSum(T[] array, T value){
        double sum = 0.0;
        for (T elem: array) {
            if(elem.compareTo(value) > 0){
                sum += elem.doubleValue();
            }
        }
        return sum;
    }
}
