package racingCar.strategy;

import racingCar.RandomGenerator;

public class RandomMoveStrategy implements MoveStrategy {
  private static final int MOVE_CRITERIA = 3;

  public boolean isMovable() {
    return RandomGenerator.getNumber() > MOVE_CRITERIA;
  }
}
