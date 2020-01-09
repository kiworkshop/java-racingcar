import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingCarGame {
    private List<RacingCar> racingCars = new ArrayList<>();
    private int trialNum;

    public RacingCarGame(List<String> racingCarNames, int trialNum) {
        for (String racingCarName : racingCarNames) {
            racingCars.add(new RacingCar(racingCarName));
        }
        this.trialNum = trialNum;
    }

    public RacingCarGameResult run() {
        //RacingCarGameResult racingCarGameResult = new RacingCarGameResult();
        int winnerDist = 0;
        int firstWinnerIdx = 0;

        System.out.println("실행 결과");
        for (int i = 0; i < trialNum; i++) {
            for(RacingCar racingCar : racingCars) {
                racingCar.moveOneStep();
                System.out.print(racingCar.getName() + " : ");
                for (int j = 0; j < racingCar.getDistance(); j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
        }

        int i = 0;
        for(RacingCar racingCar : racingCars) {
            if (racingCar.getDistance() > winnerDist) {
                winnerDist = racingCar.getDistance();
                firstWinnerIdx = i;
            }
            i++;
        }

        System.out.print(racingCars.get(firstWinnerIdx).getName());
        for (i = firstWinnerIdx + 1; i < racingCars.size(); i++) {
            if (racingCars.get(i).getDistance() == winnerDist) {
                System.out.print(", " + racingCars.get(i).getName());
            }
        }
        System.out.println("가 최종 우승했습니다.");

        return null;
/*
        for (int i = 0; i < trialNum; i++) {
            //new RacingCarGameHistory();

            for (RacingCar racingCar : racingCars) {
                RacingCarSnapshot racingCarSnapshot = racingCar.moveOneStep2();
            }
        }
*/
    }
}
