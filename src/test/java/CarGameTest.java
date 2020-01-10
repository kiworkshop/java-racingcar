import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class CarGameTest {

  @Test
  void play_ValidInput_ValidGameResult() {
    CarGame carGame = getCarGameFixture();
    assertThat(carGame.play()).isInstanceOf(GameResult.class);
  }

  @Test
  void runTrial_Cars_CarResults() {
    CarGame carGame = getCarGameFixture();
    int trialNum = 1;
    List<CarResult> carResult = carGame.runTrial(CarTest.getCarsFixture(1));
    assertThat(carResult.get(0)).hasFieldOrPropertyWithValue("trialNum", trialNum);
  }

  CarGame getCarGameFixture() {
    int trialNum = 4;
    List<Car> cars = CarTest.getCarsFixture(4);
    return getCarGameFixture(trialNum, cars);
  }

  CarGame getCarGameFixture(int trialNum, List<Car> cars) {
    CarGameStarter starter = new CarGameStarter();
    return starter.createGame(trialNum, cars);
  }
}
