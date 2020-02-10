package racingCar.strategy;

public class ManualMoveStrategy implements MoveStrategy {
  private boolean isMovable;

  public ManualMoveStrategy(boolean isMovable) {
    this.isMovable = isMovable;
  }

  public boolean isMovable() {
    return this.isMovable;
  }
}
