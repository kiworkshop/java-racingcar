import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarGame {
    private List<String> carNames;
    private List<Car> cars = new ArrayList<>();
    private int trialNumber;

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
            car.forward();
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

    public List<Car> getCars() {
        return cars;
    }

    public int getTrialNumber() {
        return this.trialNumber;
    }
}
