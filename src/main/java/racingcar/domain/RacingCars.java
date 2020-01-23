package racingcar.domain;

import java.util.*;

public class RacingCars {

    List<RacingCar> cars = new ArrayList<>();

    public RacingCars(List<RacingCar> cars) {
        if (hasDuplicatedNamesIn(cars)) {
            throw new IllegalArgumentException();
        }
        this.cars = cars;
    }

    public boolean hasDuplicatedNamesIn(List<RacingCar> cars) {
        Set<RacingCar> nameSet = new HashSet<>(cars);
        return cars.size() != nameSet.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingCars that = (RacingCars) o;
        return Objects.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
