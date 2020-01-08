import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      System.out.println("경주할 자동차 이름을 입력하세요.");
      Scanner scan = new Scanner(System.in);
      String carNameInput = scan.nextLine();

      // CarNames를 바탕으로 각각의 Car객체 생성
      // TODO: 2020-01-04 ArrayList 등 다른걸로 바꾼다...
      String[] carNames = carNameInput.split(",");
      Car[] cars = new Car[carNames.length];
      for (int i = 0; i < carNames.length; i++) {
        cars[i] = new Car(carNames[i]);
      }
      System.out.println("시도할 회수는 몇회 인가요?");
      int numberOfTry = scan.nextInt();
      System.out.println("실행 결과");
      for (int i = 0; i < numberOfTry; i++) {
        for (int j = 0; j < cars.length; j++) {
          cars[j].move();
          cars[j].showMovement();
        }
      }
      // 비교하여 최종 우승자를 선정
      ArrayList<Car> winners = new ArrayList<>();
      for (int i = 0; i < cars.length; i++) {
      }
      System.out.println("가 최종 우승했습니다.");
    }
}
