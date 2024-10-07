package htlgkr.friedlm22052.hue3.task2.utilitys;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseConverter {
    public static List<String> upperCase(String[] strings) {
        return Arrays.stream(strings)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
