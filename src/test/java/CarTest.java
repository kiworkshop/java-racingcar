import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class CarTest {

  @Test
  void move_ValidInput_ValidOutput() {
    Car car = getCarFixture();
    int prevTrialNum = car.getTrialNum();
    int prevDistance = car.getDistance();
    car.move();
    assertThat(car.getTrialNum()).isEqualTo(prevTrialNum + 1);
    assertThat(car.getDistance()).isBetween(prevDistance, prevDistance + 1);
  }

  static Car getCarFixture() {
    return new Car("car" + RandomGenerator.getNumber());
  }

  static List<Car> getCarsFixture(int carNum) {
    List<Car> cars = new ArrayList<>();
    for (int i = 0; i < carNum; i++) {
      cars.add(getCarFixture());
    }
    return cars;
  }
}
