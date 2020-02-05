package racingcar.domain.proceedingstrategy;

public class ManualProceedingStrategy implements ProceedingStrategy{

    @Override
    public boolean isProceedable() {
        return true;
    }
}
