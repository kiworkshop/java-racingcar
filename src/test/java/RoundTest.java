import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class RoundTest {

  @Test
  void proceed_ValidInput_ValidOutput() {
    // given
    Round round = new Round();
    String carNames = "김지우,조광일,구미향";
    List<Car> cars = CarTest.getCarsFixture(carNames);

    // when
    round.proceed(cars);
    // then

    assertThat(round.getCarSnapShots())
        .isEqualTo(cars.stream().map(Car::getCarSnapShot).collect(Collectors.toList()));
  }

//  테스트의 어려움 : getWinnerCarNames() 메소드는 Car의 위치가 랜덤으로 바뀐다는 로직에 종속적이다.
//                    따라서 어떻게 테스트를 해야할지 모르겠다. Setter 없이 데이터를 쑤셔 넣어서 테스트를 해야 하는가?
  @Test
  void showWinners_validateGetWinnerCarNames() {
    // given

    // when

    // then

  }
}
