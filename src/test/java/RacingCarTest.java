import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RacingCarTest {
    @Test
    void move() {
        // given
        RacingCar racingCar = new RacingCar("car");
        int prevDistatnce = racingCar.getDistance();
        //when
        racingCar.move();

        //then
        assertThat(racingCar.getDistance()).isEqualTo(prevDistatnce+ RacingCar.ONE_STEP);


    }
}