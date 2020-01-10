import java.util.List;

class GameResult {
  private List<GameSnapshot> snapshots;

  GameResult(List<GameSnapshot> snapshots) {
    this.snapshots = snapshots;
  }

  void printResults() {
    for (GameSnapshot snapshot : snapshots) {
      snapshot.printOneTrial();
    }
  }
}
