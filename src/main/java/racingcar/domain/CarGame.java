package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class CarGame {
    private List<String> carNames;
    private List<RacingCar> cars = new ArrayList<>();
    private int trialNumber;

    public CarGame(List<String> carNames, int trialNumber) {
        this.carNames = carNames;
        this.trialNumber = trialNumber;
    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * 10 + 1);
    }

    public void prepareCars() {
        for (String carName : carNames) {
            cars.add(new RacingCar(carName));
        }
    }

    public CarGameResult run() {
        List<RacingCar> newCars = new ArrayList<>();
        for (RacingCar car : cars) {
            if (CarGame.generateRandomNumber() >= 4) {
                car.forward();
            }
            newCars.add(car);
        }
        return new CarGameResult(newCars);
    }

    public void printResult(CarGameResult result) {
        List<RacingCar> cars = result.getCars();
        for (RacingCar car : cars) {
            String carName = car.getName();
            int progress = car.getPosition();
            System.out.println(carName + " : " + progress);
        }
        System.out.println("");
    }

    public void printWinners(CarGameResult result) {
        List<RacingCar> cars = result.getCars();
        List<String> winners = new ArrayList<>();
        int maxProgress = 0;
        for (RacingCar car : cars) {
            if (maxProgress == car.getPosition()) {
                winners.add(car.getName());
            }
            if (maxProgress < car.getPosition()) {
                maxProgress = car.getPosition();
                winners.clear();
                winners.add(car.getName());
            }
        }
        System.out.println(String.join(", ", winners) + "가 최종 우승했습니다.");
    }

    public void play(CarGame game) {
        System.out.println("실행 결과");
        for (int i = 1; i <= trialNumber; i++) {
            CarGameResult result = run();
            printResult(result);
            if (i == trialNumber) {
                game.printWinners(result);
            }
        }
    }

    public List<RacingCar> getCars() {
        return cars;
    }

    public int getTrialNumber() {
        return this.trialNumber;
    }
}
