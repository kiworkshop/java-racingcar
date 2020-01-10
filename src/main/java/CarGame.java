import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarGame {
    private List<String> carNames;
    private List<Car> cars = new ArrayList<>();
    private int trialNumber;

    public static int generateRandomNumber() {
        return (int)(Math.random() * 10 + 1);
    }

    public CarGame(List<String> carNames, int trialNumber) {
        this.carNames = carNames;
        this.trialNumber = trialNumber;
    }

    public void prepareCars() {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    public CarGameResult run() {
        List<Car> newCars = new ArrayList<>();
        for (Car car : cars) {
            if (CarGame.generateRandomNumber() >= 4) {car.forward();}
            newCars.add(car);
        }
        return new CarGameResult(newCars);
    }

    public void printResult(CarGameResult result) {
        List<Car> cars = result.getCars();
        for (Car car : cars) {
            String carName = car.getName();
            int progress = car.getProgress();
            System.out.println(carName + " : " + progress);
        }
        System.out.println("");
    }

    public void printWinners(CarGameResult result){
        List<Car> cars = result.getCars();
        List<String> winners = new ArrayList<>();
        int maxProgress = 0;
        for (Car car : cars) {
            if (maxProgress == car.getProgress()) {
                winners.add(car.getName());
            }
            if (maxProgress < car.getProgress()) {
                maxProgress = car.getProgress();
                winners.clear();
                winners.add(car.getName());
            }
        }
        System.out.println(String.join(", ", winners) + "가 최종 우승했습니다.");
    }
    public void play(CarGame game){
        for(int i = 1; i <= trialNumber; i++) {
            CarGameResult result = game.run();
            game.printResult(result);
            if (i== trialNumber) {game.printWinners(result);}
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getTrialNumber() {
        return this.trialNumber;
    }
}
