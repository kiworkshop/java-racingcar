package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.RacingCar;

import static org.junit.jupiter.api.Assertions.*;

public class TestRacingCar {
    @Test
    public void testCarExist() {
        RacingCar car = new RacingCar();

        assertNotNull(car);
    }

    @Test
    public void testEquality() {
        RacingCar car1 = new RacingCar();
        car1.setName("hyundai");
        RacingCar car2 = new RacingCar();
        car2.setName("hyundai");

        assertEquals(car1, car2);
    }

    @Test
    public void testCarName() {
        RacingCar car = new RacingCar();
        car.setName("hyundai");

        assertEquals(car.getName(),"hyundai");
    }
}
