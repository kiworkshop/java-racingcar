package racingCar.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsoleInputView {
  private static final String DELIMITER = ",";

  public static List<String> getCarNamesFromUser() {
    System.out.println("경주할 자동차 이름을 입력하세요.");
    Scanner scan = new Scanner(System.in);
    String carNameInput = scan.nextLine();
    return Arrays.asList(carNameInput.split(DELIMITER));
  }

  public static int getNumOfTrialFromUser() {
    System.out.println("시도할 회수는 몇회 인가요?");
    Scanner scan = new Scanner(System.in);
    return scan.nextInt();
  }
}
