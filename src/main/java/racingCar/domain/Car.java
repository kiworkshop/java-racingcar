package racingCar.domain;

import racingCar.RandomGenerator;

public class Car {
  private String name;
  private int trialNum;
  private int distance;

  public Car(String name) {
    this.name = name;
  }

  public CarResult move() {
    trialNum += 1;
    if (RandomGenerator.getNumber() > 3) {
      distance += 1;
    }
    return new CarResult(name, distance);
  }

  public String getName() {
    return name;
  }

  public int getTrialNum() {
    return trialNum;
  }

  public int getDistance() {
    return distance;
  }
}
