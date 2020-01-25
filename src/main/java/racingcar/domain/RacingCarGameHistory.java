package racingcar.domain;

import racingcar.domain.car.RacingCar;
import racingcar.domain.car.RacingCars;

import java.util.ArrayList;
import java.util.List;

public class RacingCarGameHistory {

    private List<RacingCarSnapShot> snapShots = new ArrayList<>();

    public void takeSnapshots(RacingCars cars) {
        cars.stream().forEach(car -> snapShots.add(takeSnapshot(car)));
    }

    private RacingCarSnapShot takeSnapshot(RacingCar car) {
        return new RacingCarSnapShot(car);
    }

    public int getNumberOfSnapShots() {
        return snapShots.size();
    }
}
