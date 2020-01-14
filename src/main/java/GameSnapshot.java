import java.util.ArrayList;
import java.util.List;

class GameSnapshot {
  private List<CarResult> carResults = new ArrayList<>();

  GameSnapshot(List<CarResult> carResults) {
    this.carResults = carResults;
  }

  void printOneTrial() {
    for (CarResult carResult : carResults) {
      carResult.printDistance();
    }
    System.out.println();
  }

  public List<CarResult> getCarResults() {
    return carResults;
  }
}
