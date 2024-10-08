package htlgkr.friedlm.hue2.testmethods;

import java.util.Arrays;
import java.util.List;

public class HalloJavamitForEach {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "World", "Java", "forEach");

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(s -> System.out.println(s));

        list.forEach(System.out::println);
    }
}
