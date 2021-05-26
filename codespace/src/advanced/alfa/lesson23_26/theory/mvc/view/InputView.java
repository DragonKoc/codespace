package advanced.alfa.lesson23_26.theory.mvc.view;

import java.util.Scanner;

public class InputView {
    private static Scanner sc = new Scanner(System.in);

    public static int inputIntValueWithScanner(CalculateView view) {
        view.printMessage(view.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + "\n\n"
                    + view.INPUT_INT_DATA);
            sc.next();
        }
            return sc.nextInt();
        }

}
