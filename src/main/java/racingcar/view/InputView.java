package racingcar.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String MESSAGE_GET_RACING_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)";
    private static final String MESSAGE_GET_RACING_CAR_GAME_ROUND = "시도할 회수는 몇회인가요?";

    public String getRacingCarNames() {
        System.out.println(MESSAGE_GET_RACING_CAR_NAMES);
        return SCANNER.nextLine();
    }

    public int getRacingCarGameRound() {
        System.out.println(MESSAGE_GET_RACING_CAR_GAME_ROUND);
        return SCANNER.nextInt();
    }
}
