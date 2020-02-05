package racingcar.domain.proceedingstrategy;

public class RandomProceedingStrategy implements ProceedingStrategy {

    private static final int FORWARD_NUMBER = 4;

    @Override
    public boolean isProceedable() {
        int randomNumber = (int) (Math.random() * 10);
        return randomNumber >= FORWARD_NUMBER;
    }
}
