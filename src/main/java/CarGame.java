import java.util.Scanner;

public class CarGame {
    //private List<Car> Cars = new ArrayList<>();
    private String carName;
    private int trialNumber;

    public CarGame() {
    }

    public CarGame(String carName, int trialNumber) {
        this.carName = carName;
        this.trialNumber = trialNumber;
    }

    public String getCarName() {
        return this.carName;
    }

    public int getTrialNumber() {
        return this.trialNumber;
    }
}
