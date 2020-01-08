import java.util.Scanner;

public class CarGame {
    private String carName;
    private int trialNumber;

    public void CarGame() {}

    public String getCarName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분).");
        return this.carName = "hyundai"; //return this.carName = sc.nextLine();
    }

    public int getTrialNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("시도할 회수는 몇회인가요?");
        return this.trialNumber = 3;
    }
}
