package domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RacingCarsTest {

    @Test
    void generateRacingCarsFromString() {
        String[] carsArray = {"재주", "광일", "덕수", "우빈"};
        String carName = "재주";

        List<String> carNameList = Arrays.asList(carsArray);

        RacingCars racingCars = new RacingCars(carNameList);
        assertTrue(racingCars.size() == carNameList.size());

        List<String> duplicateCarNameList = new ArrayList<>(carNameList);
        duplicateCarNameList.add(carName);
        assertThrows(IllegalArgumentException.class, () -> new RacingCars(duplicateCarNameList));

        List<String> aloneCarNameList = new ArrayList<>();
        aloneCarNameList.add(carName);
        assertThrows(IllegalArgumentException.class, () -> new RacingCars(aloneCarNameList));
    }
}
