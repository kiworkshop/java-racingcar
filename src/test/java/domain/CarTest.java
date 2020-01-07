package domain;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    void testCar() {
        Car car = new Car("hihi");
        assertNotNull(car.getName());
        assertNotNull(car.getPosition());

        assertThrows(IllegalArgumentException.class, () -> new Car("overfive"));
    }

    @Test
    void testCarMoveForward() {
        Car car = new Car("jaeju");
        int initialCarPosition = car.getPosition();

        car.move(3);
        assertEquals(initialCarPosition, car.getPosition());

        car.move(4);
        assertFalse(initialCarPosition == car.getPosition());
    }
}
