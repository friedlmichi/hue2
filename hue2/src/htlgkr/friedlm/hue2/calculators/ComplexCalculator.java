package htlgkr.friedlm.hue2.calculators;

import htlgkr.friedlm.hue2.model.Number;
import htlgkr.friedlm.hue2.interfaces.CalculationOperation;

public class ComplexCalculator extends AbstractCalculator {

    public ComplexCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        double resultA = a.getA() + b.getA();
        double resultB = a.getB() + b.getB();
        return new Number(resultA, resultB);
    }

    @Override
    public Number subtract(Number a, Number b) {
        double resultA = a.getA() - b.getA();
        double resultB = a.getB() - b.getB();
        return new Number(resultA, resultB);
    }

    @Override
    public Number multiply(Number a, Number b) {
        double resultA = a.getA() * b.getA() - a.getB() * b.getB();
        double resultB = a.getA() * b.getB() + a.getB() * b.getA();
        return new Number(resultA, resultB);
    }

    @Override
    public Number divide(Number a, Number b) {
        double divisor = b.getA() * b.getA() + b.getB() * b.getB();
        double resultA = (a.getA() * b.getA() + a.getB() * b.getB()) / divisor;
        double resultB = (a.getB() * b.getA() - a.getA() * b.getB()) / divisor;
        return new Number(resultA, resultB);
    }
}
