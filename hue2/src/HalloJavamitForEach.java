import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavamitForEach {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        for (String s : list) {
            System.out.println(s);
        }
        //list.forEach((String s) -> System.out.println(s));
        list.forEach(System.out::println);

        Consumer<String> consumer = System.out::println;


    }
}
