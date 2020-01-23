package racingcar.domain;

import org.junit.jupiter.api.Test;
import racingcar.domain.car.RacingCar;

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
}
