import java.util.List;

public class Round {
  private int round;

  private Round(int round) {
    this.round = round;
  }

  public static Round of(int round) {
    return new Round(round);
  }

  public void go(List<Car> cars) {
    for (Car car: cars) {
      List<Integer> positions = Rule.getPositions(round);
      car.updatePositions(positions);
    }
  }

  public int getRound() {
    return round;
  }
}
