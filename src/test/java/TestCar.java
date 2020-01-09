import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCar {
    @Test
    public void testCarExist() {
        Car car = new Car();

        assertNotNull(car);
    }

    @Test
    public void testEquality() {
        Car car1 = new Car();
        car1.setName("hyundai");
        Car car2 = new Car();
        car2.setName("hyundai");

        assertEquals(car1, car2);
    }

    @Test
    public void testCarName() {
        Car car = new Car();
        car.setName("hyundai");

        assertEquals(car.getName(),"hyundai");
    }
}
