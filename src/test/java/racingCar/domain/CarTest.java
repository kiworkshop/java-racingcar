package racingCar.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import racingCar.RandomGenerator;
import racingCar.strategy.ManualMoveStrategy;

class CarTest {

  @Test
  void move_ValidInput_ValidOutput() {
    Car car = getCarFixture();
    int prevTrialNum = car.getTrialNum();
    int prevDistance = car.getDistance();
    car.move(new ManualMoveStrategy(true));
    assertThat(car.getTrialNum()).isEqualTo(prevTrialNum + 1);
    assertThat(car.getDistance()).isEqualTo(prevDistance + 1);
  }

  static Car getCarFixture() {
    return new Car("racingCar" + RandomGenerator.getNumber());
  }

  static List<Car> getCarsFixture(int carNum) {
    List<Car> cars = new ArrayList<>();
    for (int i = 0; i < carNum; i++) {
      cars.add(getCarFixture());
    }
    return cars;
  }
}
