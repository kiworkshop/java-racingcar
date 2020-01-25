package racingcar.service;

import racingcar.domain.RacingCarGameHistory;
import racingcar.domain.RacingCarGameResult;
import racingcar.domain.car.RacingCar;
import racingcar.domain.car.RacingCars;
import racingcar.domain.proceedingstrategy.ProceedingStrategy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCarService {

    private static final String CAR_NAME_DELIMITER = ",";

    public RacingCars produceCarsWith(String carNames) {
        String[] parsedCarNames = parseCarNames(carNames);
        List<RacingCar> cars = produceCarsWith(parsedCarNames);
        return new RacingCars(cars);
    }

    public List<RacingCar> produceCarsWith(String[] parsedCarNames) {
        return Arrays.stream(parsedCarNames)
                .map(String::trim)
                .map(RacingCar::new)
                .collect(Collectors.toList());
    }

    private String[] parseCarNames(String carNames) {
        return carNames.split(CAR_NAME_DELIMITER);
    }

    public RacingCarGameResult race(RacingCars cars, int lastRound, ProceedingStrategy strategy) {
        RacingCarGameResult result = new RacingCarGameResult();
        result.recordInitialHistory(cars);

        for (int round = 1; round <= lastRound; round++) {
            cars.moveForward(strategy);
            RacingCarGameHistory history = new RacingCarGameHistory();
            history.takeSnapshots(cars);
            result.record(history);
        }
        return result;
    }
}
