package racingCar;

public class RandomGenerator {
  public static int getNumber() {
    double randomValue = Math.random();
    return (int) (randomValue * 10);
  }
}
