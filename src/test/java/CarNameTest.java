import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {
  @Test
  void with_ValidInput_ValidOutput() {
    // given
    String input = "김지우";

    // when
    CarName carName = CarName.of(input);

    // then
    assertThat(CarName.of(input)).isEqualTo(carName);
  }

  @Test
  void with_InvalidInput_ThrowException() {
    // given
    String input = "이름길이초과";

    // then
    assertThatThrownBy(() -> CarName.of(input)).isInstanceOf(IllegalArgumentException.class);
  }

}