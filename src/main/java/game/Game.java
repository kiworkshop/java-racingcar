package game;

import domain.Car;
import domain.RacingCars;
import domain.RacingResult;
import domain.Trial;
import exception.InvalidInputException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Game {

    private static final String NOT_A_NUMBER_EXCEPTION = "시도 횟수는 숫자만 입력 가능합니다.";
    private static final String CAR_NAME_DELIMITER = ",";

    public void play() {
        String namesFromUser = GameInputScanner.getCarNameFromUser();
        RacingCars racingCars = generateRacingCarsFrom(namesFromUser);
        String trialFromUser = GameInputScanner.getTrial();
        Trial trial = generateTrialFrom(trialFromUser);
        RacingResult racingResult = runGame(racingCars, trial);
        racingResult.printResult();
        racingResult.printWinners();
    }

    private RacingCars generateRacingCarsFrom(String input) {
        List<String> carNames = Arrays.asList(input.split(CAR_NAME_DELIMITER));
        List<Car> cars = carNames.stream().map(Car::from).collect(Collectors.toList());
        return RacingCars.from(cars);
    }

    private Trial generateTrialFrom(String input) {
        int trial = convertToIntFrom(input);
        return Trial.from(trial);
    }

    private int convertToIntFrom(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException ne) {
            throw InvalidInputException.from(NOT_A_NUMBER_EXCEPTION);
        }
    }

    private RacingResult runGame(RacingCars racingCars, Trial trial) {
        RacingResult racingResult = new RacingResult();

        for (int i = 0; i < trial.getTrial(); i++) {
            runOneTurn(racingCars);
            recordOneTurn(racingResult, racingCars);
        }

        return racingResult;
    }

    private void runOneTurn(RacingCars racingCars) {
        racingCars.runOneTurn();
    }

    private void recordOneTurn(RacingResult racingResult, RacingCars racingCars) {
        racingResult.add(racingCars.getCarSnapShots());
    }

}
