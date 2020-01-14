import java.util.ArrayList;
import java.util.List;

class GameResult {
  private List<GameSnapshot> snapshots = new ArrayList<>();
  private List<Car> winners = new ArrayList<>();

  GameResult(List<GameSnapshot> snapshots) {
    this.snapshots = snapshots;
  }

  void printResults() {
    for (GameSnapshot snapshot : snapshots) {
      snapshot.printOneTrial();
    }
    List<CarResult> winners = Judge.pickWinners(snapshots.get(snapshots.size() - 1));
    printWinners(winners);
  }

  void printWinners(List<CarResult> winners) {
    System.out.print("우승자: ");
    for (CarResult winner : winners) {
      System.out.print(winner.getName());
    }
    System.out.println();
  }
}
