import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputTest {
  @Test
  void getCarNames_ValidInput_ValidOutput() {
    // given
    String names = "김지우,조광일,구미향";
    List<Car> cars = CarTest.getCarsFixture(names);

    // then
    assertThat(Input.getCars(names)).isEqualTo(cars);
  }

  @Test
  void getCarNames_InvalidInput_InvalidOutput() {
    // given
    String names = "이름길이초과,조광일,구미향";

    // then
    assertThatThrownBy(() -> Input.getCars(names)).isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  void getRounds_ValidInput_ValidOutput() {
    // given
    int roundNum = 3;

    Round first = new Round();
    Round second = new Round();
    Round third = new Round();

    List<Round> rounds = new ArrayList<>();
    rounds.add(first);
    rounds.add(second);
    rounds.add(third);

    // then
    assertThat(Input.getRounds(roundNum)).isEqualTo(rounds);
  }
}
