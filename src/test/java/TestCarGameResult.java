import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCarGameResult {
    @Test
    public void testCarGameResultExist() {
        List<String> carNames = Arrays.asList("hyundai");
        CarGame game = new CarGame(carNames, 3);
        game.prepareCars();
        List<Car> car = game.getCars();

        CarGameResult result = new CarGameResult(car);
        List<Car> car1 = result.getCars();

        List<Car> car2 = Arrays.asList(new Car("hyundai"));

        assertEquals(car1, car2);
    }


}
