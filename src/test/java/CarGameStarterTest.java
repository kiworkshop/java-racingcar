import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;

class CarGameStarterTest {
    // TODO: 2020-01-11 indent 4->2로 모두 수정
    // TODO: 2020-01-10 Scanner input 받는 데에서 멈추는 현상 고려하여 테스트 수정
    @Test
    void getCarNamesFromUser_ValidInput_SaveToStarter() {
        CarGameStarter gameStarter = new CarGameStarter();
        gameStarter.getCarNamesFromUser();
        assertThat(gameStarter.getCarNames()).isNotEmpty();
    }

    @Test
    void createGame_ValidInput_ValidCarGame() {
      int trialNum = 4;
      CarGameStarter gameStarter = new CarGameStarter();
      List<Car> cars = CarTest.getCarsFixture(4);
      CarGame carGame = gameStarter.createGame(trialNum, cars);
      assertThat(carGame).isNotNull()
          .hasFieldOrPropertyWithValue("trialNum", trialNum)
          .hasFieldOrPropertyWithValue("cars", cars);
    }
}