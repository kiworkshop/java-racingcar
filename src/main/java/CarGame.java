import java.util.ArrayList;
import java.util.List;

class CarGame {
  private int trialNum;
  private List<Car> cars = new ArrayList<>();

  CarGame(int trialNum, List<Car> cars) {
    this.trialNum = trialNum;
    this.cars = cars;
  }

  GameResult play() {
    List<GameSnapshot> snapshots = new ArrayList<>();
    for (int i = 0; i < trialNum; i++) {
      List<CarResult> carResults = runTrial(cars);
      snapshots.add(new GameSnapshot(carResults));
    }
    return new GameResult(snapshots);
  }

  List<CarResult> runTrial(List<Car> cars) {
    List<CarResult> carResults = new ArrayList<>();
    for (Car car: cars) {
      CarResult carResult = car.move();
      carResults.add(carResult);
    }
    return carResults;
  }
}
