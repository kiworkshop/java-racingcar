import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
  public static List<Car> getCarsFixture(String carNames) {
    return Arrays.stream(carNames.split(","))
        .map(CarName::of)
        .map(Car::with)
        .collect(Collectors.toList());
  }

  @Test
  void go_InputManualStrategy_ChangePosition() {
    // given
    Car car = Car.with(CarName.of("김지우"));
//    여기서 차의 위치가 0인 것을 단언해야 하지 않을까?

    // when
    car.go(new ManualStrategy(true));

    // then
    assertThat(car.getPosition()).isEqualTo(1);
  }

  @Test
  void go_InputManualStrategy_NotChangePosition() {
    // given
    Car car = Car.with(CarName.of("김지우"));

    // when
    car.go(new ManualStrategy(false));

    // then
    assertThat(car.getPosition()).isEqualTo(0);
  }
}
