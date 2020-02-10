package racingCar.domain;

import java.util.ArrayList;
import java.util.List;

public class CarGame {
  private int trialNum;
  private List<Car> cars = new ArrayList<>();

  private CarGame(int trialNum, List<Car> cars) {
    this.trialNum = trialNum;
    this.cars = cars;
  }

  public static CarGame of(int trialNum, List<Car> cars) {
    return new CarGame(trialNum, cars);
  }

  public GameResult play() {
    List<GameSnapshot> snapshots = new ArrayList<>();
    for (int i = 0; i < trialNum; i++) {
      GameSnapshot carResults = runTrial(cars);
      snapshots.add(carResults);
    }
    return new GameResult(snapshots);
  }

  protected GameSnapshot runTrial(List<Car> cars) {
    List<Car> carResults = new ArrayList<>();
    for (Car car : cars) {
      Car carResult = car.move();
      carResults.add(carResult);
    }
    return new GameSnapshot(carResults);
  }
}
