package game;

import domain.Car;
import domain.TrialTime;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Game {

    public void play() {
        GameScanner gameScanner = new GameScanner();
        List<Car> cars = generateCars(gameScanner);
        TrialTime trialTime = generateTrialTimes(gameScanner);
        runGame(cars, trialTime);
        showResult(cars);
    }

    private List<Car> generateCars(GameScanner gameScanner) {
        String namesFromUser = gameScanner.requestNames();
        List<String> names = Arrays.asList(namesFromUser.split(","));
        return names.stream().map(Car::new).collect(Collectors.toList());
    }

    private TrialTime generateTrialTimes(GameScanner gameScanner) {
        int trialTimes = gameScanner.requestTrialTimes();
        return new TrialTime(trialTimes);
    }

    private void runGame(List<Car> cars, TrialTime trialTime) {
        for (int i = 0; i < trialTime.getTrialTime(); i++) {
            runOneTime(cars);
        }
    }

    private void runOneTime(List<Car> cars) {
        cars.forEach(Car::goOrStop);
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
    }

    private void showResult(List<Car> cars) {
        List<String> carNames = getFirstCars(cars);
        StringBuilder result = new StringBuilder();
        for (String carName : carNames) {
            result.append(carName + ", ");
        }
        System.out.println(result.toString() + "가 최종 우승하셨습니다.");
    }

    private List<String> getFirstCars(List<Car> cars) {
        int highScore = getHighScore(cars);
        return cars.stream().filter(car -> car.getPosition() == highScore)
                .map(car -> car.getName()).collect(Collectors.toList());
    }

    private int getHighScore(List<Car> cars) {
        int highScore = 0;
        for (Car car : cars) {
            if (car.getPosition() > highScore) {
                highScore = car.getPosition();
            }
        }
        return highScore;
    }
}
