package racingcar.domain;

import racingcar.domain.car.RacingCar;

public class RacingCarSnapShot {

    private final String name;
    private final int position;

    public RacingCarSnapShot(final RacingCar car) {
        this.name = car.getName();
        this.position = car.getPosition();
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
