package htlgkr.friedlm22052.hue3.task2.randomFunctions;
    import java.util.Random;

    public class RandomNumberGenerator {
        public static int[] generateRandomNumbers() {
            Random random = new Random();
            return random.ints(10000, 0, 101).toArray();
        }
    }

