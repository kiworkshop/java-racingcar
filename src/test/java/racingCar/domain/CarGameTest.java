package racingCar.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CarGameTest {

  @Test
  void play_ValidInput_ValidGameResult() {
    CarGame carGame = getCarGameFixture();
    assertThat(carGame.play()).isInstanceOf(GameResult.class);
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
