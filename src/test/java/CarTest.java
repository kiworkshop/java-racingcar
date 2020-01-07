import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getName() {
        Car car = new Car("CAR_NAME_TEST");
        assertEquals("CAR_NAME_TEST",car.getName());
    }

    @Test
    void go() {
    }

    @Test
    void printPostion() {
        Car car = new Car("CAR_NAME_TEST");
        assertEquals(0, 0);
    }

    @Test
    void getPosition() {
        Car car = new Car("CAR_NAME_TEST");
        assertEquals(0, car.getPosition());
    }
}