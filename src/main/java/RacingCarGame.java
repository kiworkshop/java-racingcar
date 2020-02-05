import java.util.List;

public class RacingCarGame {

  public static final String MESSAGE_RESULT = "결과";
  public static final String LINE_CHANGE = " ";
  public static final int THRESHOLD = 4;

  private List<Car> cars;
  private List<Round> rounds;
  private ForwardStrategy randomStrategy = new RandomStrategy(THRESHOLD);

  private RacingCarGame(InputData inputData) {
    cars = inputData.getCars();
    rounds = inputData.getRounds();
  }

  public static RacingCarGame with(InputData inputData) {
    return new RacingCarGame(inputData);
  }

  public void run() {
    rounds.forEach(round -> round.proceed(cars, randomStrategy));
  }

  public void showResult() {
    showRoundsResult();
    showWinners();
  }

  private void showWinners() {
    Round lastRound = getLastRound();
    lastRound.showWinners();
  }

  private Round getLastRound() {
    int lastIndex = rounds.size() - 1;

    return rounds.get(lastIndex);
  }

  private void showRoundsResult() {
    System.out.println(MESSAGE_RESULT);
    rounds.forEach(Round::showResult);
    System.out.println(LINE_CHANGE);
  }
}
