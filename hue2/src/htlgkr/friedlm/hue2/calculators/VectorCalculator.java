package htlgkr.friedlm.hue2.calculators;

import htlgkr.friedlm.hue2.model.Number;
import htlgkr.friedlm.hue2.interfaces.CalculationOperation;

public class VectorCalculator extends AbstractCalculator {

    public VectorCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a, b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract.calc(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        double resultA = a.getA() * b.getB() - a.getB() * b.getA();
        double resultB = a.getB() * b.getA() - a.getA() * b.getB();
        return new Number(resultA, resultB);
    }

    @Override
    public Number divide(Number a, Number b) {

        double result = a.getA() * b.getA() + a.getB() * b.getB();
        return new Number(result, 0);
    }
}
