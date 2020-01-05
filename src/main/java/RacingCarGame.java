import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingCarGame {
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
        int maxPosition = 0;
        for (Car car : cars) {
            if (maxPosition < car.getPosition()) {
                maxPosition = car.getPosition();
            }
        }

        for (Car car : cars) {
            car.printWinnerName(maxPosition);
        }
        System.out.print("가 최종 우승했습니다 ");

    }

    private static List<Car> makeCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    private static String[] makeCarNames() {
        String[] carNames = inputCarNames().split(",");
        return carNames;
    }

    private static int inputCount() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void printInputCountMessage() {
        System.out.println("시도할 횟수는 몇회인가요?");
    }


    private static String inputCarNames() {
        Scanner sc = new Scanner(System.in);
        String carNames = sc.nextLine();
        return carNames;
    }

    private static void printInputCarNameMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표를 기준으로 구분)");
    }


}

