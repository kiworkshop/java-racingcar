package racingCar.domain;

public class CarResult {
  private String name;
  private int distance;

  public CarResult(String name, int distance) {
    this.name = name;
    this.distance = distance;
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

  int getDistance() {
    return distance;
  }
}
