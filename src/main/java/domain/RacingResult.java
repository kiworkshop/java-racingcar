package domain;

import java.util.ArrayList;
import java.util.List;

public class RacingResult {

    private static final String FORMATTED_ROUND_STATEMENT = "%d 회차";
    private static final int DIFFERENCE_BETWEEN_INDEX_ROUND = 1;

    private List<CarSnapShots> carSnapShotsList = new ArrayList<>();

    public void add(CarSnapShots carSnapShots) {
        carSnapShotsList.add(carSnapShots);
    }

    public void printResult() {
        for (CarSnapShots carSnapShots : carSnapShotsList) {
            System.out.println(String.format(FORMATTED_ROUND_STATEMENT, getRound(carSnapShots)));
            carSnapShots.printCarSnapShots();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {

            }
        }
    }

    private int getRound(CarSnapShots carSnapShots) {
        return carSnapShotsList.indexOf(carSnapShots) + DIFFERENCE_BETWEEN_INDEX_ROUND;
    }

    public void printWinners() {
        CarSnapShots latestCarSnapShots = getLatestResult();
        latestCarSnapShots.printWinners();
    }

    public CarSnapShots getLatestResult() {
        return carSnapShotsList.get(getLatestIndex());
    }

    private int getLatestIndex() {
        return carSnapShotsList.size() - DIFFERENCE_BETWEEN_INDEX_ROUND;
    }
}
