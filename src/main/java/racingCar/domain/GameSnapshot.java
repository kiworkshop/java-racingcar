package racingCar.domain;

import java.util.ArrayList;
import java.util.List;

public class GameSnapshot {
  private List<CarResult> carResults = new ArrayList<>();
  private List<CarResult> winners = new ArrayList<>();

  public GameSnapshot(List<CarResult> carResults) {
    this.carResults = carResults;
    this.winners = pickWinners(carResults);
  }

  private List<CarResult> pickWinners(List<CarResult> carResults) {
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

  public void printWinners() {
    System.out.print("우승자: ");
    for (CarResult winner : winners) {
      System.out.print(winner.getName());
    }
    System.out.println();
  }

  public void printOneTrial() {
    for (CarResult carResult : carResults) {
      carResult.printDistance();
    }
    System.out.println();
  }
}