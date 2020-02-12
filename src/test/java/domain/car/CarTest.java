package domain.car;

import domain.strategy.CarProceedStrategy;
import exception.InvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static domain.strategy.AlwaysNotProceedStrategyTest.getAlwaysNotProceedStrategyFixture;
import static domain.strategy.AlwaysProceedStrategyTest.getAlwaysProceedStrategyFixtrue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
        assertThat(car).isNotNull()
                .hasFieldOrPropertyWithValue("name", JAEJU_CAR_NAME);
    }

    @Test
    void generateCarFromEmptyStringThrowsException() {
        assertThrows(InvalidInputException.class, () -> Car.from(EMPTY_STRING));
    }

    @Test
    void generateCarFromOverFiveLengthStringThrowsException() {
        assertThrows(InvalidInputException.class, () -> Car.from(OVER_LENGTH_STRING));
    }

    @Test
    void testCarMoveForward() {
        int initialCarPosition = car.getPosition();

        car.moveOrNot(alwaysNotProceedStrategy);
        assertTrue(car.inSamePositionWith(initialCarPosition));

        car.moveOrNot(alwaysProceedStrategy);
        assertFalse(car.inSamePositionWith(initialCarPosition));
    }

}
