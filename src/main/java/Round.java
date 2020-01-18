import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Round {

  public static final int INITIAL_POSITION = 0;
  public static final String MESSAGE_WINNERS = "우승자~~";
  public static final String DELIMITER = ",";
  public static final String LINE_CHANGE = "";

  private List<CarSnapShot> carSnapShots = new ArrayList<>();

  public void proceed(List<Car> cars, ForwardStrategy forwardStrategy) {

    for (Car car: cars) {
      car.go(forwardStrategy);
      carSnapShots.add(car.getCarSnapShot());
    }
  }

  public List<CarSnapShot> getCarSnapShots() {
    return carSnapShots;
  }

  public void showResult() {
    carSnapShots.forEach(CarSnapShot::show);
    System.out.println(LINE_CHANGE);
  }

  public void showWinners() {
    List<String> winners = getWinnerCarNames();

    System.out.println(MESSAGE_WINNERS);
    System.out.println(String.join(DELIMITER, winners));
  }

  private List<String> getWinnerCarNames() {
    List<String> winnerCarNames = new ArrayList<>();

    int maxPosition = INITIAL_POSITION;
    for (CarSnapShot carSnapShot: carSnapShots) {
      if (carSnapShot.isGreaterThan(maxPosition)) {
        maxPosition = carSnapShot.getPosition();
        winnerCarNames.clear();
        winnerCarNames.add(carSnapShot.getName());
        continue;
      }

      if (carSnapShot.isSame(maxPosition)) {
        winnerCarNames.add(carSnapShot.getName());
      }
    }
    return winnerCarNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Round round = (Round) o;
    return Objects.equals(carSnapShots, round.carSnapShots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carSnapShots);
  }
}
