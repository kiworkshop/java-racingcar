import java.util.List;

class GameSnapshot {
  private List<CarResult> carResults;

  GameSnapshot(List<CarResult> carResults) {
    this.carResults = carResults;
  }

  void printOneTrial() {
    for (CarResult carResult : carResults) {
      carResult.printMovement();
    }
    System.out.println();
  }
}
