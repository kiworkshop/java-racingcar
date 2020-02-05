package racingcar.domain.car;

import racingcar.domain.proceedingstrategy.ProceedingStrategy;

import java.util.Objects;

public class RacingCar {

    private static final int CAR_NAME_MAX_LENGTH = 5;

    private final String name;
    private int position = 1;

    public RacingCar(final String name) {
        this.name = name;

        if(nameIsLongerThanMaxLength()) {
            throw new IllegalArgumentException();
        }
    }

    private boolean nameIsLongerThanMaxLength() {
        return name.length() > CAR_NAME_MAX_LENGTH;
    }

    public void moveForward(ProceedingStrategy strategy) {
        if(strategy.isProceedable()) {
            position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingCar car = (RacingCar) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "racingcar.domain.Car{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
