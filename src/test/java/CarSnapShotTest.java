import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarSnapShotTest {
  @Test
  void positionToString_ValidInput_ValidOutput() {
    // given
    CarSnapShot carSnapShot = CarSnapShot.of("지우", 5);
    String str = "-----";

    // then
    assertThat(carSnapShot.positionToString(carSnapShot.getPosition())).isEqualTo(str);
  }

  @Test
  void isGreaterThan_returnTrue() {
    // given
    CarSnapShot carSnapShot = CarSnapShot.of("김지우", 5);
    int maxPosition = 3;

    // then
    assertThat(carSnapShot.isGreaterThan(maxPosition)).isTrue();
  }

  @Test
  void isGreaterThan_returnFalse() {
    // given
    CarSnapShot carSnapShot = CarSnapShot.of("김지우", 5);
    int maxPosition = 10;

    // then
    assertThat(carSnapShot.isGreaterThan(maxPosition)).isFalse();
  }

  @Test
  void isSame_returnTrue() {
    // given
    CarSnapShot carSnapShot = CarSnapShot.of("김지우", 5);
    int maxPosition = 5;
    // when

    // then
    assertThat(carSnapShot.isSame(maxPosition)).isTrue();
  }
}