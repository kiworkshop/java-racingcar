package game;

import java.util.Scanner;

public class GameScanner {

    private Scanner scanner = new Scanner(System.in);

    public String requestNames() {
        System.out.println("이름을 입력하세요. 이름은 쉼표(,) 단위로 분리됩니다.");
        return scanner.nextLine();
    }

    public int requestTrialTimes() {
        System.out.println("시도 횟수를 입력하세요.");
        return scanner.nextInt();
    }
}
