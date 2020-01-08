import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
  private static final Scanner sc = new Scanner(System.in);

  public static List<Car> getCars() {
    List<Car> cars = new ArrayList<>();

    System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분");
    String input = sc.nextLine();
    String[] carNames = input.split(",");
    for(String carName: carNames) {
      Car car = new Car(carName);
      cars.add(car);
    }
    return cars;
  }

  public static Round getPlayRound() {
    System.out.println("시도할 회수는 몇회인가요?");
    int round = sc.nextInt();
    return Round.of(round);
  }
}
