public class Application {
  public static void main(String[] args) {
    InputData inputData = Input.getInputData();

    RacingCarGame racingCarGame = RacingCarGame.with(inputData);
    racingCarGame.run();

    racingCarGame.showResult();
  }
}
