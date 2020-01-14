import java.util.ArrayList;
import java.util.List;

public class GameSnapshotTest {

  static GameSnapshot getGameSnapshotFixture(int trialNum, int furthestDistance) {
    List<CarResult> carResults = new ArrayList<>();
    carResults.add(new CarResult("name1", trialNum, 0));
    carResults.add(new CarResult("name2", trialNum, 1));
    carResults.add(new CarResult("name3", trialNum, furthestDistance));
    carResults.add(new CarResult("name4", trialNum, furthestDistance));

    return new GameSnapshot(carResults);
  }
}
