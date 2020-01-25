package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCarGameResult {

    private List<RacingCarGameHistory> histories = new ArrayList<>();

    public void record(RacingCarGameHistory history) {
        histories.add(history);
    }
}
