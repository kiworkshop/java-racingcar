package racingcar.view;

import com.sun.deploy.util.StringUtils;
import racingcar.domain.RacingCarGameHistory;
import racingcar.domain.RacingCarGameResult;
import racingcar.domain.RacingCarSnapShot;
import racingcar.domain.car.RacingCar;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {

    private static final String GAME_RESULT_MESSAGE = "실행 결과";
    private static final String CAR_POSITION_DELIMITER = " : ";
    private static final String NULL = "\0";
    private static final String CAR_POSITION_DISPLAY_SIGN = "-";
    private static final String GAME_WINNER_MESSAGE = "이(가) 최종 우승했습니다.";
    private static final String WINNER_NAME_DELIMITER = ", ";

    public void printGameResult(final RacingCarGameResult result) {
        System.out.println();
        System.out.println(GAME_RESULT_MESSAGE);

        printGameHistories(result);
    }

    private void printGameHistories(final RacingCarGameResult result) {
        result.stream().forEach(this::printGameHistory);
    }

    private void printGameHistory(final RacingCarGameHistory history) {
        history.stream().forEach(this::printRacingCarSnapShot);
        System.out.println();
    }

    private void printRacingCarSnapShot(final RacingCarSnapShot snapShot) {
        String convertedSnapShot = convertSnapShotToString(snapShot);
        System.out.println(convertedSnapShot);
    }

    private String convertSnapShotToString(RacingCarSnapShot snapShot) {
        return snapShot.getName() + CAR_POSITION_DELIMITER + generatePositionDisplayLine(snapShot.getPosition());
    }

    private String generatePositionDisplayLine(int position) {
        return new String(new char[position]).replace(NULL, CAR_POSITION_DISPLAY_SIGN);
    }

    public void printWinners(final RacingCarGameResult result) {
        int lastRound = result.getLastRound();
        List<RacingCarSnapShot> winners = result.findWinnersIn(lastRound);
        System.out.println(convertWinnersToString(winners) + GAME_WINNER_MESSAGE);
    }

    private String convertWinnersToString(List<RacingCarSnapShot> winners) {
        List<String> carNames = winners.stream()
                .map(RacingCarSnapShot::getName)
                .collect(Collectors.toList());

        return StringUtils.join(carNames, WINNER_NAME_DELIMITER);
    }
}
