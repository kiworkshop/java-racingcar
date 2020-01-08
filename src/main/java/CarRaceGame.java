import java.util.List;

public class CarRaceGame {
  public static void main(String[] args) {
    List<Car> cars = Input.getCars();
    Round round = Input.getPlayRound();

    round.go(cars);

    Result.printResult(cars, round);
  }
}
