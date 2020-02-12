package domain.strategy;

public class AlwaysNotProceedStrategy implements CarProceedStrategy {
    @Override
    public boolean isAllowedToGo() {
        return false;
    }
}
