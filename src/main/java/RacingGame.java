import java.util.*;

public class RacingGame {

    private RacingCars racingCars = new RacingCars();
    private int racingNum;

    RacingGame (){
        initRacingCar();
        initTrial();
    }

    private void initTrial() {
        System.out.println("시도할회수는몇회인가요?");
        Scanner scan = new Scanner(System.in);
        racingNum = scan.nextInt();
    }

    public void run() {
        tryRacing();
        showWinner();
    }

    private void showWinner() {
        int winnerDist = 0;
        List<String> winnerGroup = new ArrayList();
        for(RacingCar racingCar : racingCars.getRacingCars()){
            if(winnerDist < racingCar.getDistance()){
                winnerDist = racingCar.getDistance();
                winnerGroup.clear();
                winnerGroup.add(racingCar.getName());
            }
            else if( winnerDist == racingCar.getDistance() )
                winnerGroup.add(racingCar.getName());
        }
        System.out.println(winnerGroup + "가 최종 우승했습니다.");
    }

    private void initRacingCar(){
        System.out.println("경주할자동차이름을입력하세요(이름은쉼표(,)를기준으로구분).");
        Scanner scan = new Scanner(System.in);
        scan = new Scanner(scan.next()).useDelimiter(",");
        while(scan.hasNext()){
            String key = scan.next();
            racingCars.add(new RacingCar(key));
        }
    }

    private void tryRacing(){
        for(int i=0 ; i<racingNum; i++){
            oneLap();
        }
    }

    private void oneLap() {
        for(RacingCar racingCar : racingCars.getRacingCars()){
            if(runDice())
            {
                racingCar.setDistance(racingCar.getDistance() + 1);
            }
        }
        printOneLap();
    }

    private void printOneLap() {
        System.out.println("실행결과");
        for(RacingCar racingCar : racingCars.getRacingCars())
        {
            printOneCar(racingCar);
        }
    }

    private void printOneCar(RacingCar racingCar) {
        System.out.print(racingCar.getName() + " : ");
        for(int i=0 ; i<racingCar.getDistance() ; i++)
            System.out.print("-");
        System.out.println();
    }

    private boolean runDice(){
        Random rand = new Random();
        if(rand.nextInt(10) >= 4){
            return true;
        }
        return false;
    }
}