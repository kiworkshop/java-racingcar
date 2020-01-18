import java.util.Random;

public class RandomStrategy implements ForwardStrategy {

  private int threshold;
  private Random random = new Random();

  public RandomStrategy(int threshold) {
    this.threshold = threshold;
  }

  @Override
  public boolean isForward() {
    return random.nextInt() > threshold;
  }
}
