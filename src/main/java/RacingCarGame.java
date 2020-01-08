import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RacingCarGame {

    private static final String DELEMITER_CARNAMES = ",";
    private static final String MESSAGE_INPUT_COUNT = "시도할 횟수는 몇회인가요?";
    private static final String MESSAGE_INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표를 기준으로 구분)";

    public static void main(String[] args) {
        printInputCarNameMessage();
        String[] carNames = makeCarNames();
        printInputCountMessage();
        int raceCount = inputCount();
        RacingCarGamePlay racingCarGamePlay = new RacingCarGamePlay(carNames, raceCount);
        racingCarGamePlay.raceCars();
    }


    private static String[] makeCarNames() {
        return inputCarNames().split(DELEMITER_CARNAMES);
    }

     private static int inputCount() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

     private static void printInputCountMessage() {
        System.out.println(MESSAGE_INPUT_COUNT);
    }

    private static String inputCarNames() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void printInputCarNameMessage() {
        System.out.println(MESSAGE_INPUT_CAR_NAME);
    }

}

