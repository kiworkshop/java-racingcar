package racingcar.domain;

import racingcar.domain.car.RacingCar;
import racingcar.domain.car.RacingCars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

    public Stream<RacingCarSnapShot> stream() {
        return snapShots.stream();
    }

    public List<RacingCarSnapShot> findWinners() {
        List<RacingCarSnapShot> winners = new ArrayList<>();

        int maxPosition = 0;
        for (RacingCarSnapShot snapShot : snapShots) {
            if (snapShot.getPosition() == maxPosition) {
                winners.add(snapShot);
            }
            if (snapShot.getPosition() > maxPosition) {
                maxPosition = snapShot.getPosition();
                winners.clear();
                winners.add(snapShot);
            }
        }

        return winners;
    }
}
