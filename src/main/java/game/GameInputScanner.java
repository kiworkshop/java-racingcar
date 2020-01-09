package game;

import java.util.Scanner;

public class GameInputScanner {

    private static final Scanner scanner = new Scanner(System.in);

    private static final String CAR_NAME_ASKING_STATEMENT = "경주할 자동차 이름을 입력하세요. 이름은 쉼표(,) 단위로 구분 됩니다.";
    private static final String TRIAL_ASKING_STATEMENT = "시도 횟수를 입력하세요.";

    public String getCarNameFromUser() {
        System.out.println(CAR_NAME_ASKING_STATEMENT);
        return scanner.nextLine();
    }

    public String getTrial() {
        System.out.println(TRIAL_ASKING_STATEMENT);
        return scanner.nextLine();
    }
}
