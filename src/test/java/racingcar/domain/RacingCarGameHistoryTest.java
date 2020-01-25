package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.RacingCars;
import racingcar.service.RacingCarService;

import static org.assertj.core.api.Assertions.assertThat;

class RacingCarGameHistoryTest {

    private RacingCars cars;
    private final RacingCarService racingCarService = new RacingCarService();

    @BeforeEach
    public void setUp() {
        String carNames = "abc,abcd";
        cars = racingCarService.produceCarsWith(carNames);
    }

    @Test
    public void 히스토리_안의_스냅샷_개수가_자동차_수와_똑같은지_테스트() {
        // given
        RacingCarGameHistory history = new RacingCarGameHistory();

        // when
        history.takeSnapshots(cars);

        // then
        assertThat(history.getNumberOfSnapShots()).isEqualTo(cars.getNumberOfCars());
    }
}