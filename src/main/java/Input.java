import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Input {

  public static final String DELIMITER = ",";
  public static final String MESSAGE_INPUT_CAR_NAMES = "경주할 자도차 이름을 입력하세요.(이름은 쉼표(,)를 기준으로 구분)";
  public static final String MESSAGE_INPUT_ROUND = "시도할 회수는 몇회인가요?";

  public static Scanner sc = new Scanner(System.in);

  public static InputData getInputData() {
    List<Car> cars = getCars(getInputNames());
    List<Round> rounds = getRounds(getInputRound());
    return InputData.of(cars, rounds);
  }

  public static List<Car> getCars(String names) {
    List<String> carNames = Arrays.asList(names.split(DELIMITER));

    return carNames.stream().map(CarName::of).map(Car::with).collect(Collectors.toList());
  }

  public static List<Round> getRounds(int roundNum) {
    List<Round> rounds = new ArrayList<>();
    for (int i=0; i<roundNum; i++) {
      Round round = new Round();
      rounds.add(round);
    }
    return rounds;
  }

  public static String getInputNames() {
    System.out.println(MESSAGE_INPUT_CAR_NAMES);
    return sc.nextLine();
  }

  public static int getInputRound() {
    System.out.println(MESSAGE_INPUT_ROUND);
    return sc.nextInt();
  }
}
