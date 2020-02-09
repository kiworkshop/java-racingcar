package racingCar;

import java.util.List;
import java.util.stream.Collectors;

import racingCar.domain.Car;
import racingCar.domain.CarGame;
import racingCar.view.ConsoleInputView;

public class CarGameStarter {

  public CarGame createCarGame() {
    List<String> carNames = ConsoleInputView.getCarNamesFromUser();
    int trialNum = ConsoleInputView.getNumOfTrialFromUser();
    List<Car> cars = carNames.stream().map(Car::new).collect(Collectors.toList());
    return CarGame.of(trialNum, cars);
  }
}
