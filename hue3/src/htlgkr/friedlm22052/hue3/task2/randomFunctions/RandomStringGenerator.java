package htlgkr.friedlm22052.hue3.task2.randomFunctions;

import java.util.Random;

public class RandomStringGenerator {
    public static String[] generateRandomStrings() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        String[] randomStrings = new String[10];
        for (int i = 0; i < 10; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 10; j++) {
                sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
            }
            randomStrings[i] = sb.toString();
        }
        return randomStrings;
    }//@TODO FRAGEN WEGEN EINFACHEREN WEG ZUM RANDOMSTRING BAUEN
}

