import java.util.List;

public class Result {
  public static void printResult(List<Car> cars, Round round) {
    System.out.println("실행 결과");

    for (int currentRound=0; currentRound<round.getRound(); currentRound++) {
      printRoundResult(cars, currentRound);
    }
  }

  private static void printRoundResult(List<Car> cars, int currentRound) {
    for (Car car: cars) {
      System.out.print(car.getName());
      System.out.print(":");
      int currentRoundPosition = car.getCurrentRoundPosition(currentRound);
      for (int i=0; i<currentRoundPosition; i++) {
        System.out.print("-");
      }
      System.out.print("\n");
    }
  }

}
