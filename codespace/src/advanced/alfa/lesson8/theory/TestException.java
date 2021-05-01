package advanced.alfa.lesson8.theory;

public class TestException {

    public static class Test_finally {
        void procA() {
            try {
                System.out.println("Method procA()");
                return;
            } finally {
                System.out.println("Block finally of method procA()");
            }
        }

        int procB() {
            try {
                System.out.println("Method procB()");
                return 1;
            } finally {
                System.out.println("Block finally of methodprocB()");
                return 0;
            }
        }

        static void testG() {
            try {
                throw new ClassCastException("Demo1");
            } catch (ClassCastException exp) {
                System.out.println("Exception in method!");
                throw exp;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            int sum = 0;
            for (int i = 0; i <= 6; i += 2) {
                sum += arr[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Program Error!");
        }

        System.out.println("Program Finish OK!");

        Test_finally testf = new Test_finally();
        testf.procA();

        System.out.println(testf.procB());

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " " + "1");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " " + "2");
        }

        try {
            testf.testG();
        } catch (ClassCastException e) {
            System.out.println("Exception of method!");
        }
    }
}
