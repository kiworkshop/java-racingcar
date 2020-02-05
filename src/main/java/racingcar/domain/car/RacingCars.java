package racingcar.domain.car;

import racingcar.domain.proceedingstrategy.ProceedingStrategy;

import java.util.*;
import java.util.stream.Stream;

public class RacingCars {

    List<RacingCar> cars = new ArrayList<>();

    public RacingCars(List<RacingCar> cars) {
        if (hasDuplicatedNamesIn(cars)) {
            throw new IllegalArgumentException();
        }
        this.cars = cars;
    }

    private boolean hasDuplicatedNamesIn(List<RacingCar> cars) {
        Set<RacingCar> nameSet = new HashSet<>(cars);
        return cars.size() != nameSet.size();
    }

    public void moveForward(ProceedingStrategy strategy) {
        for (RacingCar car : cars) {
            car.moveForward(strategy);
        }
    }

    public Stream<RacingCar> stream() {
        return cars.stream();
    }

    public int getNumberOfCars() {
        return cars.size();
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
