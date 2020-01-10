import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {

    public static CarGame getGameInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)");
        List<String> carNames = Arrays.asList(sc.nextLine().split(","));
        System.out.println("시도할 회수는 몇회인가요?");
        int trialNumber = sc.nextInt();
        System.out.println("");
        return new CarGame(carNames, trialNumber);
    }

    public void main() {
        CarGame game = getGameInfo();
        game.prepareCars();
        CarGameResult result = game.run();
        game.printResult(result);
    }
}
