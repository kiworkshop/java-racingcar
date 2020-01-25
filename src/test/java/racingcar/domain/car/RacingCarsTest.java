package racingcar.domain.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.RacingCar;
import racingcar.domain.car.RacingCars;
import racingcar.service.RacingCarService;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class RacingCarsTest {

    RacingCars actualCars;
    private RacingCarService racingCarService = new RacingCarService();

    @BeforeEach
    public void setUp() {
        List<RacingCar> cars = new ArrayList<>();

        cars.add(new RacingCar("kia"));
        cars.add(new RacingCar("bmw"));
        cars.add(new RacingCar("hyundai"));

        actualCars = new RacingCars(cars);
    }

    @Test
    public void RacingCars가_잘_생성되었는지_테스트() {
        // given
        String carNames = "kia,bmw ,hyundai";

        // when
        RacingCars expectedCars = racingCarService.produceCarsWith(carNames);

        // then
        assertThat(actualCars).isEqualTo(expectedCars);

    }

    @Test
    public void 중복된_차가_존재하는지_체크() {
        // given
        String carNames = "kia, kia, bmw";

        // when
        Throwable thrown = catchThrowable(() -> { racingCarService.produceCarsWith(carNames); });

        // then
        assertThat(thrown).isInstanceOf(IllegalArgumentException.class);
    }
}