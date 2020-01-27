package domain.strategy;

public class AlwaysProceedStrategy implements CarProceedStrategy {
    @Override
    public boolean isAllowedToGo() {
        return true;
    }
}
