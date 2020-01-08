import java.util.List;

public class Car {
  private String name;
  private List<Integer> positions;

  public Car(String name) {
    this.name = name;
  }

  public void updatePositions(List<Integer> positions) {
    this.positions = positions;
  }

  public int getCurrentRoundPosition(int currentRound) {
    return positions.get(currentRound);
  }

  public String getName() {
    return name;
  }
}
