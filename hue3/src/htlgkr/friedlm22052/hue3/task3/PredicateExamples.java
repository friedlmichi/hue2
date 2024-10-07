package htlgkr.friedlm22052.hue3.task3;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateExamples {
    public static void main(String[] args) {
        IntPredicate isEven = number -> number % 2 == 0;
        IntPredicate isPositive = number -> number > 0;
        IntPredicate isZero = number -> number == 0;

        Predicate<String> isShortWord = word -> word.length() < 4;

        System.out.println(isEven.test(4));    // true
        System.out.println(isPositive.test(5)); // true
        System.out.println(isZero.test(0));    // true
        System.out.println(isShortWord.test("Hi"));    // true
        System.out.println(isShortWord.test("Hello")); // false
    }
}
