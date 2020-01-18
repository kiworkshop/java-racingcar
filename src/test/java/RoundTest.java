import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class RoundTest {

  @Test
  void proceed_ValidInput_ValidOutput() {
    // given
    Round round = new Round();
    ForwardStrategy manualStrategy = new ManualStrategy(true);
    String carNames = "김지우,조광일,구미향";
    List<Car> cars = CarTest.getCarsFixture(carNames);

    // when
    round.proceed(cars, manualStrategy);
    // then

    assertThat(round.getCarSnapShots())
        .isEqualTo(cars.stream().map(Car::getCarSnapShot).collect(Collectors.toList()));
  }

  @Test
  void proceed_InputForward_ChangePosition() {
    // given
    Round round = new Round();
    ForwardStrategy manualStrategy = new ManualStrategy(true);
    String carNames = "김지우,조광일,구미향";
    List<Car> cars = CarTest.getCarsFixture(carNames);

    // when
    round.proceed(cars, manualStrategy);
    // then 이름 carNames, 위치 1

    assertThat(round.getCarSnapShots()).hasSize(3)
        .contains(CarSnapShot.of("김지우",1))
        .contains(CarSnapShot.of("조광일",1))
        .contains(CarSnapShot.of("구미향",1));
  }

  @Test
  void proceed_InputForward_NotChangePosition() {
    // given
    Round round = new Round();
    ForwardStrategy manualStrategy = new ManualStrategy(false);
    String carNames = "김지우,조광일,구미향";
    List<Car> cars = CarTest.getCarsFixture(carNames);

    // when
    round.proceed(cars, manualStrategy);
    // then 이름 carNames, 위치 0

    assertThat(round.getCarSnapShots()).hasSize(3)
        .contains(CarSnapShot.of("김지우",0))
        .contains(CarSnapShot.of("조광일",0))
        .contains(CarSnapShot.of("구미향",0));
  }
//  테스트의 어려움 : getWinnerCarNames() 메소드는 Car의 위치가 랜덤으로 바뀐다는 로직에 종속적이다.
//                    따라서 어떻게 테스트를 해야할지 모르겠다. Setter 없이 데이터를 쑤셔 넣어서 테스트를 해야 하는가?
  @Test // 이젠 Test 가능 : 케이스 2명, 1명, 0명
  void showWinners_validateGetWinnerCarNames() {
    // given

    // when

    // then

  }
}
