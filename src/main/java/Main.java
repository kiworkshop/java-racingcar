import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("시도할회수는몇회인가요?");
        Scanner scan = new Scanner(System.in);
        int racingNum = scan.nextInt();

        RacingGame racingGame = new RacingGame(racingNum);
        racingGame.run();
    }
}
