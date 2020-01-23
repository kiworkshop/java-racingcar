package racingcar.domain;

import java.util.Objects;

public class RacingCar {
    private String name;
    private int progress = 0;

    public RacingCar() {
    }

    public RacingCar(String name) {
        this.name = name;
    }

    public void forward() {
        progress++;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProgress() {
        return progress;
    }

    @Override
    public String toString() {
        return "racingcar.domain.Car{" +
                "name='" + name + '\'' +
                ", progress=" + progress +
                '}';
    }
}
