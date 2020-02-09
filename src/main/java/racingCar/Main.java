package racingCar;

import racingCar.domain.CarGame;
import racingCar.domain.GameResult;
import racingCar.view.ConsoleOutputView;

public class Main {

  public static void main(String[] args) {
    CarGameStarter gameStarter = new CarGameStarter();
    CarGame carGame = gameStarter.createCarGame();
    GameResult result = carGame.play();
    ConsoleOutputView.printResult(result);
  }
}
