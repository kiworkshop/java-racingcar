import java.util.List;

public class InputData {

  private List<CarName> carNames;
  private List<Round> rounds;

  private InputData(List<CarName> carNames, List<Round> rounds) {
    this.carNames = carNames;
    this.rounds = rounds;
  }

  public static InputData of(List<CarName> carNames, List<Round> rounds) {
    return new InputData(carNames, rounds);
  }
}
