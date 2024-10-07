package htlgkr.friedlm22052.hue3.task4;

import java.util.stream.IntStream;

public class OddNumberSquaring {
    public static int calculateSumOfSquaredOdds() {
        // Erstelle einen IntStream mit Ganzzahlen von 1 bis 10 (einschließlich 10)
        return IntStream.rangeClosed(1, 10)
                // Filtere die Zahlen, um nur ungerade zahlen zu behalten
                .filter(n -> n % 2 != 0)
                // Quadriere jede der ungeraden zahlen
                .map(n -> n * n)
                // Reduziere den Stream auf die Summe der quadrierten ungeraden zahlen,
                // starte mit 0
                .reduce(0, Integer::sum);

    }
}
