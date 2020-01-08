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
    CarName kim = CarName.of("김지우");
    CarName cho = CarName.of("조광일");
    CarName gu = CarName.of("구미향");

    List<CarName> carNames = new ArrayList<>();
    carNames.add(kim);
    carNames.add(cho);
    carNames.add(gu);

    // then
    assertThat(Input.getCarNames(names)).isEqualTo(carNames);
  }

  @Test
  void getCarNames_InvalidInput_InvalidOutput() {
    // given
    String names = "이름길이초과,조광일,구미향";

    // then
    assertThatThrownBy(() -> Input.getCarNames(names)).isInstanceOf(IllegalArgumentException.class);
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
