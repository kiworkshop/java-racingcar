import java.util.ArrayList;
import java.util.List;

class CarGame {
  private int trialNum;
  private List<Car> cars;

  CarGame(int trialNum, List<Car> cars) {
    this.trialNum = trialNum;
    this.cars = cars;
  }

  GameResult play() {
    for (int i = 0; i < trialNum; i++) {
      runTrial(cars);
    }
    return new GameResult();
  }

  List<Car> runTrial(List<Car> cars) {
    List<Car> carResults = new ArrayList<>();
    for (Car car: cars) {
      Car carResult = car.move();
      carResults.add(carResult);
    }
    return carResults;
  }
}
