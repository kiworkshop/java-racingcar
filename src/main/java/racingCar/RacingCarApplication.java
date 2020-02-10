package racingCar;

import racingCar.domain.CarGame;
import racingCar.domain.GameResult;
import racingCar.strategy.RandomMoveStrategy;
import racingCar.view.ConsoleOutputView;

public class RacingCarApplication {

  public static void main(String[] args) {
    CarGameStarter gameStarter = new CarGameStarter();
    CarGame carGame = gameStarter.createCarGame();
    GameResult result = carGame.play(new RandomMoveStrategy());
    ConsoleOutputView.printResult(result);
  }
}
