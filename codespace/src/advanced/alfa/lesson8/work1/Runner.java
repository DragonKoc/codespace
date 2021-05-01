package advanced.alfa.lesson8.work1;

public class Runner {
    public void run() {
        try {
            System.out.println(devisionInt(100, 50));
            System.out.println(devisionDouble(234.4, 0.0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public int devisionInt(int value1, int value2) {
        int result = 0;
//        try {
        result = Math.abs(value1 / value2);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        return result;
    }

    public int devisionDouble(double value1, double value2) {
//        try {
        if (value2 == 0.0) {
            throw new ArithmeticException("Delenie na 0");
        }
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//            return 0;
//        }
        return (int) Math.abs(value1 / value2);
    }


}
