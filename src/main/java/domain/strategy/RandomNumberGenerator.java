package domain.strategy;

import java.util.Random;

public class RandomNumberGenerator {

    private static final Random random = new Random();
    private static final int NUMBER_BOUND = 10;

    public static int generateNumber() {
        return random.nextInt(NUMBER_BOUND);
    }
}
