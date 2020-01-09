import java.util.List;
import java.util.Scanner;

public class CarGame {
    //private List<Car> Cars = new ArrayList<>();
    private List<String> carNames;
    private int trialNumber;

    public CarGame() {
    }

    public CarGame(List<String> carNames, int trialNumber) {
        this.carNames = carNames;
        this.trialNumber = trialNumber;
    }

    public List<String> getCarNames() {
        return this.carNames;
    }

    public int getTrialNumber() {
        return this.trialNumber;
    }
}
