import java.util.ArrayList;
import java.util.List;

public class RacingCarGamePlay {
    private static final int INITIAL_POSITION = 0;
    private static final String MESSAGE_WINNING = "가 최종 우승했습니다 ";
    private static final String DELIMITER_WINNER = ",";

    private List<String> carNames;
    private int raceCount;

    public RacingCarGamePlay(List<String> carNames, int raceCount) {
        this.carNames = carNames;
        this.raceCount = raceCount;
    }

    public void raceCars() {
        List<Car> cars = makeCars(carNames);
        for (int i = 0; i < raceCount; i++) {
            for (Car car : cars) {
                car.go();
                car.printPostion();
            }
            System.out.println();
        }
        printResult(cars);
    }

    public void printResult(List<Car> cars) {
        System.out.print(String.join(DELIMITER_WINNER, getWinner(cars)) + MESSAGE_WINNING);
    }

    public List<Car> makeCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    public ArrayList<String> getWinner(List<Car> cars) {
        int maxPosition = INITIAL_POSITION;
        ArrayList<String> winner = new ArrayList<>();
        for (Car car : cars) {
            if (maxPosition < car.getPosition()) {
                maxPosition = car.getPosition();
                winner.clear();
                winner.add(car.getName());
            }
            if (maxPosition == car.getPosition()) {
                winner.add(car.getName());
            }
        }
        return winner;
    }
}
