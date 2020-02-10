package racingCar.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameSnapshotTest {

  static GameSnapshot getGameSnapshotFixture(int furthestDistance) {
    List<Car> carResults = new ArrayList<>();
    carResults.add(new Car("name1", 0));
    carResults.add(new Car("name2", 1));
    carResults.add(new Car("name3", furthestDistance));
    carResults.add(new Car("name4", furthestDistance));

    return new GameSnapshot(carResults);
  }

  @Test
  @DisplayName("마지막 스냅샷에서 가장 멀리 나간 차를 반환한다")
  void pickWinners_LastSnapshot_furthestCars() {
    // given
    GameSnapshot lastSnapshot = GameSnapshotTest.getGameSnapshotFixture(3);
    // when
    List<Car> winners = lastSnapshot.pickWinners();
    // then
    assertThat(winners.get(0)).hasFieldOrPropertyWithValue("distance", 3);
  }

  @Test
  @DisplayName("마지막 스냅샷에서 winner가 여러명인 스냅샷에서 모든 winner를 반환한다")
  void pickWinners_sameWinnerDistance_allWinners() {
    // given
    GameSnapshot lastSnapshot = GameSnapshotTest.getGameSnapshotFixture(3);
    // when
    List<Car> winners = lastSnapshot.pickWinners();
    // then
    assertThat(winners.size()).isGreaterThan(2);
    assertThat(winners.get(0)).hasFieldOrPropertyWithValue("distance", 3);
    assertThat(winners.get(1)).hasFieldOrPropertyWithValue("distance", 3);
  }

}
