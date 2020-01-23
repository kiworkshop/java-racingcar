package racingcar.domain;

import java.util.List;
import java.util.Objects;

public class CarGameResult {
    private List<RacingCar> cars;

    public CarGameResult(List<RacingCar> cars) {
        this.cars = cars;
    }

    public List<RacingCar> getCars() {
        return cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarGameResult that = (CarGameResult) o;
        return Objects.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
