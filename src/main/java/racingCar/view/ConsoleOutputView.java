package racingCar.view;

import racingCar.domain.GameResult;
import racingCar.domain.GameSnapshot;

public class ConsoleOutputView {

  public static void printResult(GameResult gameResult) {
    for (GameSnapshot snapshot : gameResult.getSnapshots()) {
      snapshot.printOneTrial();
      snapshot.printWinners();
    }
  }
}
