package domain.car;

import domain.result.CarSnapShot;
import domain.result.CarSnapShots;
import domain.strategy.CarProceedStrategy;
import exception.InvalidInputException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CarRacing {

    private static final int CARS_MINIMUM_SIZE = 2;
    private static final String RACINGCARS_SIZE_EXCEPTION = "레이싱 경주는 최소 " + CARS_MINIMUM_SIZE + "대 이상 필요합니다.";
    private static final String DUPLICATE_RACINGCARS_EXCEPTION = "자동차 이름은 중복될 수 없습니다.";

    private List<Car> cars;

    public static CarRacing from(List<Car> cars) {
        return new CarRacing(cars);
    }

    private CarRacing(List<Car> cars) {
        validateSize(cars);
        validateDuplication(cars);
        this.cars = cars;
    }

    private void validateSize(List<Car> cars) {
        if (cars.size() < CARS_MINIMUM_SIZE) {
            throw InvalidInputException.from(RACINGCARS_SIZE_EXCEPTION);
        }
    }

    private void validateDuplication(List<Car> cars) {
        Set<Car> carNameSet = new HashSet<>(cars);
        if (cars.size() != carNameSet.size()) {
            throw InvalidInputException.from(DUPLICATE_RACINGCARS_EXCEPTION);
        }
    }

    public void runOneTurn(CarProceedStrategy strategy) {
        cars.forEach(car -> car.moveOrNot(strategy));
    }

    public CarSnapShots getCarSnapShots() {
        return CarSnapShots.from(cars.stream().map(CarSnapShot::from).collect(Collectors.toList()));
    }

    public int size() {
        return cars.size();
    }

}
