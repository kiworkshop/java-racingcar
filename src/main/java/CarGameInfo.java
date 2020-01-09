import java.util.Scanner;

public class CarGameInfo {
    //private List<Car> Cars = new ArrayList<>();
    private String carName;
    private int trialNumber;

    public CarGameInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)");
        this.carName =  sc.nextLine();
        System.out.println("시도할 회수는 몇회인가요?");
        this.trialNumber = sc.nextInt();
    }

    public String getCarName() {
        return this.carName;
    }

    public int getTrialNumber() {
        return this.trialNumber;
    }
}
