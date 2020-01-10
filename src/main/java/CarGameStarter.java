import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class CarGameStarter {
  private List<String> carNames;
  private int trialNum;

  CarGame startGame() {
    getCarNamesFromUser();
    getNumOfTrialFromUser();
    List<Car> cars = carNames.stream()
        .map(carName -> new Car(carName))
        .collect(Collectors.toList());
    return createGame(trialNum, cars);
  }

  CarGame createGame(int trialNum, List<Car> cars) {
    return new CarGame(trialNum, cars);
  }

  void getCarNamesFromUser() {
    System.out.println("경주할 자동차 이름을 입력하세요.");
    Scanner scan = new Scanner(System.in);
    String carNameInput = scan.nextLine();
    String[] carArr = carNameInput.split(",");
    carNames = new ArrayList<>();
    carNames.addAll(Arrays.asList(carArr));
  }

  void getNumOfTrialFromUser() {
    System.out.println("시도할 회수는 몇회 인가요?");
    Scanner scan = new Scanner(System.in);
    trialNum = scan.nextInt();
  }

  List<String> getCarNames() {
    return carNames;
  }

}
