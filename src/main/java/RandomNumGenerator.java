import java.util.Random;

public class RandomNumGenerator {

  public static final int CRITERION = 4;
  private static Random  random = new Random();

  public static boolean isGreaterThanCriterion() {
    return random.nextInt() >= CRITERION;
  }
}
