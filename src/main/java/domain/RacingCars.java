package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RacingCars {

    private static final int CARS_MINIMUM_SIZE = 2;

    private List<Car> cars;

    public RacingCars(List<String> carNameList) {
        validateSize(carNameList);
        validateDuplication(carNameList);
        this.cars = carNameList.stream().map(Car::new).collect(Collectors.toList());
    }

    private void validateSize(List<String> carNameList) {
        if (carNameList.size() < CARS_MINIMUM_SIZE)  {
            throw new IllegalArgumentException();
        }
    }

    private void validateDuplication(List<String> carNameList) {
        Set<String> carNameSet = new HashSet<>(carNameList);
        if (carNameList.size() != carNameSet.size()) {
            throw new IllegalArgumentException();
        }
    }

    public int size() {
        return cars.size();
    }

}
