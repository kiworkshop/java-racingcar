public class ManualStrategy implements ForwardStrategy {

  private boolean isForward;

  public ManualStrategy(boolean isForward) {
    this.isForward = isForward;
  }

  public boolean isForward() {
    return isForward;
  }
}
