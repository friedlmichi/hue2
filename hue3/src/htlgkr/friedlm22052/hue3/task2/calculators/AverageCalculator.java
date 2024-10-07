package htlgkr.friedlm22052.hue3.task2.calculators;

import java.util.Arrays;

public class AverageCalculator {
    public static double average(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0.0);
    }
}
