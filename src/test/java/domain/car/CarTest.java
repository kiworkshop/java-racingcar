package domain.car;

import domain.result.CarSnapShot;
import domain.strategy.CarProceedStrategy;
import exception.InvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static domain.strategy.AlwaysNotProceedStrategyTest.getAlwaysNotProceedStrategyFixture;
import static domain.strategy.AlwaysProceedStrategyTest.getAlwaysProceedStrategyFixtrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

    private static final String JAEJU_CAR_NAME = "jaeju";
    private static final String EMPTY_STRING = "";
    private static final String OVER_LENGTH_STRING = "overfivw";

    private CarProceedStrategy alwaysProceedStrategy = getAlwaysProceedStrategyFixtrue();
    private CarProceedStrategy alwaysNotProceedStrategy = getAlwaysNotProceedStrategyFixture();
    private Car car;

    @BeforeEach
    void setUp() {
        car = Car.from(JAEJU_CAR_NAME);
    }

    @Test
    void testCar() {
        assertNotNull(car.getName());

        assertThrows(InvalidInputException.class, () -> Car.from(EMPTY_STRING));
        assertThrows(InvalidInputException.class, () -> Car.from(OVER_LENGTH_STRING));
    }

    @Test
    void testCarMoveForward() {
        int initialCarPosition = car.getPosition();

        car.moveForward(alwaysNotProceedStrategy);
        assertTrue(car.inSamePositionWith(initialCarPosition));

        car.moveForward(alwaysProceedStrategy);
        assertFalse(car.inSamePositionWith(initialCarPosition));
    }

    @Test
    void testGetCarSnapShot() {
        CarSnapShot carSnapShot = car.getCarSnapShot();

        assertNotNull(carSnapShot);
        assertEquals(car.getName(), carSnapShot.getName());
        assertEquals(car.getPosition(), carSnapShot.getPosition());
    }
}
