package domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RacingCarsTest {

    public static RacingCars getRacingCarsFixture() {
        List<Car> cars = getCarsFixture();

        return new RacingCars(cars);
    }

    @Test
    void generateRacingCarsFromString() {
        String carName = "재주";
        List<String> carNameList = getCarNameListFixture();
        List<Car> cars = getCarsFixture();

        RacingCars racingCars = new RacingCars(cars);
        assertTrue(racingCars.size() == carNameList.size());

        List<String> duplicateCarNameList = new ArrayList<>(carNameList);
        duplicateCarNameList.add(carName);
        List<Car> duplicateCarList = duplicateCarNameList.stream().map(Car::new).collect(Collectors.toList());
        assertThrows(IllegalArgumentException.class, () -> new RacingCars(duplicateCarList));

        List<String> aloneCarNameList = new ArrayList<>();
        aloneCarNameList.add(carName);
        List<Car> aloneCarList = aloneCarNameList.stream().map(Car::new).collect(Collectors.toList());
        assertThrows(IllegalArgumentException.class, () -> new RacingCars(aloneCarList));
    }

    private static List<Car> getCarsFixture() {
        return getCarNameListFixture().stream().map(Car::new).collect(Collectors.toList());
    }

    private static List<String> getCarNameListFixture() {
        String[] carsArray = {"재주", "광일", "덕수", "우빈"};
        return Arrays.asList(carsArray);
    }
}
