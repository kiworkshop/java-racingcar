package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.RacingCar;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRacingCarGameResult {
    @Test
    public void testCarGameResultExist() {
        List<String> carNames = Arrays.asList("hyundai");
        CarGame game = new CarGame(carNames, 3);
        game.prepareCars();
        List<RacingCar> car = game.getCars();

        CarGameResult result = new CarGameResult(car);
        List<RacingCar> car1 = result.getCars();

        List<RacingCar> car2 = Arrays.asList(new RacingCar("hyundai"));

        assertEquals(car1, car2);
    }

}
