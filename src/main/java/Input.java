import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Input {

  public static final String DELIMITER = ",";
  public static final Scanner sc = new Scanner(System.in);

  public static InputData getInputData() {
    List<CarName> carNames = getCarNames(getString());
    List<Round> rounds = getRounds(getInt());
    return InputData.of(carNames, rounds);
  }

  public static List<CarName> getCarNames(String names) {
    List<String> carNames = Arrays.asList(names.split(DELIMITER));

    return carNames.stream().map(CarName::of).collect(Collectors.toList());
  }

  public static List<Round> getRounds(int roundNum) {
    List<Round> rounds = new ArrayList<>();
    for (int i=0; i<roundNum; i++) {
      Round round = new Round();
      rounds.add(round);
    }
    return rounds;
  }

  public static String getString() {
    return sc.nextLine();
  }

  public static int getInt() {
    return sc.nextInt();
  }
}
