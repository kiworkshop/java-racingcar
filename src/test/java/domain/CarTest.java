package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

    Car car = new Car("jaeju");

    @Test
    void testCar() {
        assertNotNull(car.getName());
        assertNotNull(car.getPosition());

        assertThrows(IllegalArgumentException.class, () -> new Car(""));
        assertThrows(IllegalArgumentException.class, () -> new Car("overfive"));
    }

    @Test
    void testCarMoveForward() {
        int initialCarPosition = car.getPosition();

        car.moveForward(3);
        assertTrue(car.inSamePositionWith(initialCarPosition));

        car.moveForward(4);
        assertFalse(car.inSamePositionWith(initialCarPosition));
    }
}
