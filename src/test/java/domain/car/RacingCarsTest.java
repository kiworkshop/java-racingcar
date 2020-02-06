package domain.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RacingCarsTest {

    private List<String> carNameList;

    public static RacingCars getRacingCarsFixture() {
        List<Car> cars = getCarsFixture();

        return RacingCars.from(cars);
    }

    @BeforeEach
    void setUp() {
        carNameList = getCarNameListFixture();
    }

    @Test
    void generateRacingCarsFromString() {
        List<Car> cars = carNameList.stream().map(Car::from).collect(Collectors.toList());

        RacingCars racingCars = RacingCars.from(cars);
        assertTrue(racingCars.size() == carNameList.size());
    }

    @Test
    void duplicateCarNamesThrowException() {
        List<String> duplicateCarNameList = new ArrayList<>(carNameList);
        duplicateCarNameList.add(carNameList.get(0));

        List<Car> duplicateCarList = duplicateCarNameList.stream().map(Car::from).collect(Collectors.toList());
        assertThrows(IllegalArgumentException.class, () -> RacingCars.from(duplicateCarList));
    }

    @Test
    void aloneCarNameListThrowException() {
        List<String> aloneCarNameList = new ArrayList<>();
        aloneCarNameList.add(carNameList.get(0));
        List<Car> aloneCarList = aloneCarNameList.stream().map(Car::from).collect(Collectors.toList());
        assertThrows(IllegalArgumentException.class, () -> RacingCars.from(aloneCarList));
    }

    private static List<Car> getCarsFixture() {
        return getCarNameListFixture().stream().map(Car::from).collect(Collectors.toList());
    }

    private static List<String> getCarNameListFixture() {
        String[] carsArray = {"재주", "광일", "덕수", "우빈"};
        return Arrays.asList(carsArray);
    }
}
