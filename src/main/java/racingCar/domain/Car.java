package racingCar.domain;

import racingCar.RandomGenerator;

public class Car {
  private String name;
  private int trialNum;
  private int distance;
  private static final int MOVE_CRITERIA = 3;

  public Car(String name) {
    this.name = name;
  }

  public Car(String name, int distance) {
    this.name = name;
    this.distance = distance;
  }

  public Car move() {
    trialNum += 1;
    if (RandomGenerator.getNumber() > MOVE_CRITERIA) {
      distance += 1;
    }
    return new Car(name, distance);
  }

  public void printDistance() {
    System.out.print(name + ":");
    for (int i = 0; i < distance; i++) {
      System.out.print("-");
    }
    System.out.println();
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
