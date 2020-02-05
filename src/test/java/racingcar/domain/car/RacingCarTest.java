package racingcar.domain.car;

import org.junit.jupiter.api.Test;
import racingcar.domain.car.RacingCar;
import racingcar.domain.proceedingstrategy.ManualProceedingStrategy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingCarTest {

    @Test
    public void 차의_이름이_다섯자_이내인지_체크() {
        // given
        RacingCar car1 = new RacingCar("abcd");
        RacingCar car2 = new RacingCar("abcde");

        // when
        Throwable thrown = catchThrowable(() -> {
            new RacingCar("abcdef");
        });

        // then
        assertEquals("abcd", car1.getName());
        assertEquals("abcde", car2.getName());
        assertThat(thrown).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 차가_잘_이동하는지_테스트() {
        // given
        RacingCar car = new RacingCar("lunar");

        // when
        car.moveForward(new ManualProceedingStrategy());
        car.moveForward(new ManualProceedingStrategy());

        // then
        assertThat(car.getPosition()).isEqualTo(2);
    }
}
