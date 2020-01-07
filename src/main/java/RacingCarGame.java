import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingCarGame {

    private static final int INITIAL_POSITION = 0;
    private static final String MESSAGE_WINNING = "가 최종 우승했습니다 ";
    private static final String DELEMITER_CARNAMES = ",";
    private static final String DELIMITER_WINNER = ",";
    private static final String MESSAGE_INPUT_COUNT = "시도할 횟수는 몇회인가요?";
    private static final String MESSAGE_INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표를 기준으로 구분)";

    public static void main(String[] args) {
        printInputCarNameMessage();
        String[] carNames = makeCarNames();
        printInputCountMessage();
        int raceCount = inputCount();
        raceCars(carNames, raceCount);
    }

    private static void raceCars(String[] carNames, int raceCount) {
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

    private static void printResult(List<Car> cars) {
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
        System.out.print(String.join(DELIMITER_WINNER, winner) + MESSAGE_WINNING);

    }
    private static List<Car> makeCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    private static String[] makeCarNames() {
        return inputCarNames().split(DELEMITER_CARNAMES);
    }

     private static int inputCount() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

     private static void printInputCountMessage() {
        System.out.println(MESSAGE_INPUT_COUNT);
    }

    private static String inputCarNames() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void printInputCarNameMessage() {
        System.out.println(MESSAGE_INPUT_CAR_NAME);
    }


}

