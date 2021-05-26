package advanced.alfa.lesson23_26.theory.mvc.controller;

import advanced.alfa.lesson23_26.theory.mvc.model.CalculateModel;
import advanced.alfa.lesson23_26.theory.mvc.view.CalculateView;
import advanced.alfa.lesson23_26.theory.mvc.view.InputView;

public class CalculateController {
    private CalculateModel model;
    private CalculateView view;
    private InputView input;

    public CalculateController() {
        this.model = new CalculateModel();
        this.view = new CalculateView();
        this.input = new InputView();
    }

    public void calculate() {
        model.setValue(InputView.inputIntValueWithScanner(view));
        model.incrementValue();
        view.printMessageAndResult(view.OUR_INT, model.getValue());
    }
}