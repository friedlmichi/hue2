package htlgkr.friedlm.hue2.interfaces;

import htlgkr.friedlm.hue2.model.Number;

@FunctionalInterface
public interface CalculationOperation {
    Number calc(Number x, Number y);
}