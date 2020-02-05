package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.RacingCar;
import racingcar.domain.proceedingstrategy.ManualProceedingStrategy;

import static org.assertj.core.api.Assertions.assertThat;

class RacingCarSnapShotTest {

    private RacingCar car;

    @BeforeEach
    public void setUp() {
        car = new RacingCar("lunar");
    }

    @Test
    public void 스냅샷이_RacingCar를_똑같이_복사했는지_테스트() {
        // given
        RacingCarSnapShot snapShot = new RacingCarSnapShot(car);

        // when

        // then
        assertThat(snapShot.getName()).isEqualTo(car.getName());
        assertThat(snapShot.getPosition()).isEqualTo(car.getPosition());
    }

    @Test
    public void RacingCar가_변경되었을_때_스냅샷이_변화하는지_테스트() {
        // given
        RacingCarSnapShot snapShot = new RacingCarSnapShot(car);

        // when
        car.moveForward(new ManualProceedingStrategy());

        // then
        assertThat(snapShot.getName()).isEqualTo(car.getName());
        assertThat(snapShot.getPosition()).isNotEqualTo(car.getPosition());
    }
}