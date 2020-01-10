package game;

import domain.Car;
import domain.RacingCars;
import domain.Trial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Game {

    public void play() {
        String namesFromUser = GameInputScanner.getCarNameFromUser();
        RacingCars racingCars = generateRacingCarsFrom(namesFromUser);
        String trialFromUser = GameInputScanner.getTrial();
        Trial trial = generateTrialFrom(trialFromUser);

    }

    private RacingCars generateRacingCarsFrom(String input) {
        List<String> carNames = Arrays.asList(input.split(","));
        List<Car> cars = carNames.stream().map(Car::new).collect(Collectors.toList());
        return new RacingCars(cars);
    }

    private Trial generateTrialFrom(String input) {
        int trial = converToIntFrom(input);
        return new Trial(trial);
    }

    private int converToIntFrom(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException ne) {
            throw new IllegalArgumentException();
        }
    }

}
