import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Weapon> list = new ArrayList<>();

        list = Files.lines(new File("weapons.csv").toPath()).skip(1)
                .map(s -> s.split(";")).map(strings -> new Weapon(
                        strings[0],
                        CombatType.valueOf(strings[1]),
                        DamageType.valueOf(strings[2]),
                        Integer.parseInt(strings[3]),
                        Integer.parseInt(strings[4]),
                        Integer.parseInt(strings[5]),
                        Integer.parseInt(strings[6])
                )).collect(Collectors.toList());
    }
}
