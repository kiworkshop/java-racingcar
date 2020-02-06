package game;

import domain.car.Car;
import domain.car.CarRacing;
import domain.result.RacingResult;
import domain.strategy.CarProceedStrategy;
import domain.strategy.RandomCarProceedStrategy;
import domain.trial.Trial;
import exception.InvalidInputException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Game {

    private static final String NOT_A_NUMBER_EXCEPTION = "시도 횟수는 숫자만 입력 가능합니다.";
    private static final String CAR_NAME_DELIMITER = ",";
    private static final CarProceedStrategy strategy = new RandomCarProceedStrategy();

    public void play() {
        String namesFromUser = GameInputScanner.getCarNameFromUser();
        CarRacing carRacing = generateRacingCarsFrom(namesFromUser);
        String trialFromUser = GameInputScanner.getTrial();
        Trial trial = generateTrialFrom(trialFromUser);
        RacingResult racingResult = runGame(carRacing, trial);
        racingResult.printResult();
        racingResult.printWinners();
    }

    private CarRacing generateRacingCarsFrom(String input) {
        List<String> carNames = Arrays.asList(input.split(CAR_NAME_DELIMITER));
        List<Car> cars = carNames.stream().map(Car::from).collect(Collectors.toList());
        return CarRacing.from(cars);
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

    private RacingResult runGame(CarRacing carRacing, Trial trial) {
        RacingResult racingResult = new RacingResult();

        for (int i = 0; i < trial.getTrial(); i++) {
            runOneTurn(carRacing);
            recordOneTurn(racingResult, carRacing);
        }

        return racingResult;
    }

    private void runOneTurn(CarRacing carRacing) {
        carRacing.runOneTurn(strategy);
    }

    private void recordOneTurn(RacingResult racingResult, CarRacing carRacing) {
        racingResult.add(carRacing.getCarSnapShots());
    }

}
