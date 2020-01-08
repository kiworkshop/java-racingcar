import java.util.List;
import java.util.Objects;

public class Round {

  private List<CarSnapShot> carSnapShots;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Round round = (Round) o;
    return Objects.equals(carSnapShots, round.carSnapShots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carSnapShots);
  }
}
