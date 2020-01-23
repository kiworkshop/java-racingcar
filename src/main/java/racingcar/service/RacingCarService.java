package racingcar.service;

import racingcar.domain.RacingCar;
import racingcar.domain.RacingCars;

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
}
