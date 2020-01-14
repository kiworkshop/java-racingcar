import java.util.ArrayList;
import java.util.List;

class Judge {
  static List<CarResult> pickWinners(GameSnapshot snapshot) {
    List<CarResult> carResults = snapshot.getCarResults();
    int furthestDistance = 0;
    List<CarResult> winners = new ArrayList<>();
    for (CarResult carResult : carResults) {
      if (furthestDistance < carResult.getDistance()) {
        winners.clear();
        winners.add(carResult);
        furthestDistance = carResult.getDistance();
      }
      if (furthestDistance == carResult.getDistance()) {
        winners.add(carResult);
      }
    }
    return winners;
  }
}
