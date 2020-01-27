package domain.strategy;

import java.util.Random;

public class RandomCarProceedStrategy implements CarProceedStrategy {

    private static Random random = new Random();
    private static int RANDOM_NUMBER_THRESHOLD = 10;
    private static int CAR_PROCEED_THRESHOLD = 4;

    @Override
    public boolean isAllowedToGo() {
        return getRandomNumber() >= CAR_PROCEED_THRESHOLD;
    }

    private int getRandomNumber() {
        return random.nextInt(RANDOM_NUMBER_THRESHOLD);
    }
}
