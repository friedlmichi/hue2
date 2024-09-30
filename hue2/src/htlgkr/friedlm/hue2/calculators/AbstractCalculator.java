package htlgkr.friedlm.hue2.calculators;

import htlgkr.friedlm.hue2.model.Number;
import htlgkr.friedlm.hue2.interfaces.CalculationOperation;

public abstract class AbstractCalculator {

    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation multiply;
    protected CalculationOperation divide;

    public AbstractCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public abstract Number add(Number a, Number b);
    public abstract Number subtract(Number a, Number b);
    public abstract Number multiply(Number a, Number b);
    public abstract Number divide(Number a, Number b);
}
