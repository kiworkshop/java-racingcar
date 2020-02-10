package racingCar.domain;

import java.util.ArrayList;
import java.util.List;

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
}