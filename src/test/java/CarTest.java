import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarTest {
  public static List<Car> getCarsFixture(String carNames) {
    return Arrays.stream(carNames.split(","))
        .map(CarName::of)
        .map(Car::with)
        .collect(Collectors.toList());
  }
}
