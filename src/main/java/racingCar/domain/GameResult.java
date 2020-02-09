package racingCar.domain;

import java.util.ArrayList;
import java.util.List;

public class GameResult {
  private List<GameSnapshot> snapshots = new ArrayList<>();

  public GameResult(List<GameSnapshot> snapshots) {
    this.snapshots = snapshots;
  }

  public List<GameSnapshot> getSnapshots() {
    return snapshots;
  }
}
