package racingCar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GameSnapshot {
  private List<Car> carResults = new ArrayList<>();
  private List<Car> winners = new ArrayList<>();

  public GameSnapshot(List<Car> carResults) {
    this.carResults = carResults;
    this.winners = pickWinners();
  }

  protected List<Car> pickWinners() {
    int furthestDistance = 0;
    List<Car> winners = new ArrayList<>();
    for (Car carResult : carResults) {
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

  public void printWinners() {
    System.out.print("우승자: ");
    for (Car winner : winners) {
      System.out.print(winner.getName());
    }
    System.out.println();
  }

  public void printOneTrial() {
    for (Car carResult : carResults) {
      carResult.printDistance();
    }
    System.out.println();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameSnapshot that = (GameSnapshot) o;
    return Objects.equals(carResults, that.carResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carResults);
  }
}