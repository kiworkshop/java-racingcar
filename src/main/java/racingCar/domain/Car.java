package racingCar.domain;

import java.util.Objects;

import racingCar.strategy.MoveStrategy;

public class Car {
  private String name;
  private int trialNum;
  private int distance;

  public Car(String name) {
    this.name = name;
  }

  public Car(String name, int distance) {
    this.name = name;
    this.distance = distance;
  }

  public Car move(MoveStrategy moveStrategy) {
    trialNum += 1;
    if (moveStrategy.isMovable()) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return Objects.equals(distance, car.distance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance);
  }
}
