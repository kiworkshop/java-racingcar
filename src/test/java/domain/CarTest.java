package domain;

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

}
