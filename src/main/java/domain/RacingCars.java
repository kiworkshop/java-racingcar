package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RacingCars {

    private static final int CARS_MINIMUM_SIZE = 2;

    private List<Car> racingCars;

    public RacingCars(List<Car> racingCars) {
        validateSize(racingCars);
        validateDuplication(racingCars);
        this.racingCars = racingCars;
    }

    private void validateSize(List<Car> cars) {
        if (cars.size() < CARS_MINIMUM_SIZE)  {
            throw new IllegalArgumentException();
        }
    }

    private void validateDuplication(List<Car> cars) {
        Set<Car> carNameSet = new HashSet<>(cars);
        if (cars.size() != carNameSet.size()) {
            throw new IllegalArgumentException();
        }
    }

    public void runRound() {
        racingCars.forEach(car -> car.moveForward(RandomNumberGenerator.generateNumber()));
    }

    public List<CarSnapShot> getCarSnapShots() {
        return racingCars.stream().map(Car::getCarSnapShot).collect(Collectors.toList());
    }

    public int size() {
        return racingCars.size();
    }

}
