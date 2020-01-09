import java.util.List;

public class InputData {

  private List<Car> cars;
  private List<Round> rounds;

  private InputData(List<Car> cars, List<Round> rounds) {
    this.cars = cars;
    this.rounds = rounds;
  }

  public static InputData of(List<Car> cars, List<Round> rounds) {
    return new InputData(cars, rounds);
  }

  public List<Car> getCars() {
    return cars;
  }

  public List<Round> getRounds() {
    return rounds;
  }
}
