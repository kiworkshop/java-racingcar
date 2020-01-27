package domain.result;

import com.sun.deploy.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class CarSnapShots {

    private static final int DEFAULT_POSITION = 0;
    private static final String WINNER_NAME_DELIMITER = ", ";
    private static final String WINNER_TAIL_STATEMENT = "님이 최종 우승하셨습니다.";

    private List<CarSnapShot> carSnapShots;

    public static CarSnapShots from(List<CarSnapShot> carSnapShots) {
        return new CarSnapShots(carSnapShots);
    }

    private CarSnapShots(List<CarSnapShot> carSnapShots) {
        this.carSnapShots = carSnapShots;
    }

    public void printCarSnapShots() {
        for (CarSnapShot carSnapShot : carSnapShots) {
            System.out.println(carSnapShot);
        }
        System.out.println();
    }

    public void printCarsInMaxPosition() {
        int maxPosition = getMaxPosition();
        List<CarSnapShot> carSnapShotsInMaxPosition = getCarSnapShotsIn(maxPosition);
        List<String> carNames = carSnapShotsInMaxPosition.stream().map(CarSnapShot::getName).collect(Collectors.toList());
        String joinedCarName = StringUtils.join(carNames, WINNER_NAME_DELIMITER);
        System.out.println(joinedCarName + WINNER_TAIL_STATEMENT);
    }

    public int getMaxPosition() {
        int maxPosition = DEFAULT_POSITION;

        for (CarSnapShot carSnapShot : carSnapShots) {
            if (maxPosition < carSnapShot.getPosition()) {
                maxPosition = carSnapShot.getPosition();
            }
        }
        return maxPosition;
    }

    public List<CarSnapShot> getCarSnapShotsIn(int position) {
        return carSnapShots.stream().filter(
                carSnapShot -> carSnapShot.inSamePositionWith(position))
                .collect(Collectors.toList());
    }
}
