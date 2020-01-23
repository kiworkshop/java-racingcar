package racingcar.domain.proceedingstrategy;

public class RandomProceedingStrategy implements ProceedingStrategy {

    private static final int FORWARD_NUM = 4;

    @Override
    public boolean isProceedable() {
        int randomNumber = (int) (Math.random() * 10);
        return randomNumber >= FORWARD_NUM;
    }
}
