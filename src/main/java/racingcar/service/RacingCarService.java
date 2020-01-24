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

    public RacingCarGameResult race(RacingCars racingCars, int gameRound, ProceedingStrategy strategy) {
        RacingCarGameResult result = new RacingCarGameResult();

        for (int round = 1; round <= gameRound; round++) {
            racingCars.moveForward(strategy);
            RacingCarGameHistory history = new RacingCarGameHistory();
            //history.takeSnapShot();
            //result.record(history);
        }
        return result;
    }

    private String[] parseCarNames(String carNames) {
        return carNames.split(CAR_NAME_DELIMITER);
    }
}
