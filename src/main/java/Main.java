import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static RacingCarGame getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("hello world.");
        System.out.println("안녕 세상.");
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = scan.nextLine();
        System.out.println("시도할 회수는 몇회인가요?");
        int trials = Integer.parseInt(scan.nextLine());
        System.out.println();

        return new RacingCarGame(Arrays.asList(carNames.split(",")), trials);
    }

    public static void main(String[] args) {
        RacingCarGame racingCarGame = getInput();
        racingCarGame.run();
    }
}
