package racingCar.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import racingCar.strategy.ManualMoveStrategy;

public class CarGameTest {

  @Test
  void play_ValidGameResult() {
    int movingNumber = 3;
    List<Car> cars = CarTest.getCarsFixture(4);
    CarGame carGame = CarGame.of(movingNumber, cars);
    GameResult result = carGame.play(new ManualMoveStrategy(true));

    List<Car> movedCars = new ArrayList<>();
    movedCars.add(new Car("racingCar1", 3));
    movedCars.add(new Car("racingCar2", 3));
    movedCars.add(new Car("racingCar3", 3));
    movedCars.add(new Car("racingCar4", 3));

    assertThat(result.getSnapshots().get(0)).isNotEqualTo(new GameSnapshot(cars));
    assertThat(result.getSnapshots().get(0)).isNotEqualTo(result.getSnapshots().get(1));
    assertThat(cars).isEqualTo(movedCars);
  }

  CarGame getCarGameFixture() {
    int trialNum = 4;
    List<Car> cars = CarTest.getCarsFixture(4);
    return getCarGameFixture(trialNum, cars);
  }

  CarGame getCarGameFixture(int trialNum, List<Car> cars) {
    return CarGame.of(trialNum, cars);
  }
}
