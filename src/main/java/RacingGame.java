import java.util.*;

public class RacingGame {

    public static int racingNum;
    public static HashSet<String> winnerGroup;
    public static HashMap<String, Integer> gameSnap;

    public static void main(String[] args) {

        initVar();
        whoWannaJoin();
        howManyTry();
        tryGame();
        whoIsWinner();
    }

    public static void whoWannaJoin(){
        System.out.println("경주할자동차이름을입력하세요(이름은쉼표(,)를기준으로구분).");
        Scanner scan = new Scanner(System.in);
        scan = new Scanner(scan.next()).useDelimiter(",");
        while(scan.hasNext()){
            String key = scan.next();
            gameSnap.put(key, 0);

        }
    }

    public static void howManyTry(){
        System.out.println("시도할회수는몇회인가요?");
        Scanner scan = new Scanner(System.in);
        racingNum = scan.nextInt();
    }

    public static void tryGame(){
        for(int i=0 ; i<racingNum; i++){
            for(Map.Entry<String, Integer> entry : gameSnap.entrySet()){
                if(runDice())
                {
                    gameSnap.put(entry.getKey(),entry.getValue()+1);
                }
            }
            printResult();
        }
    }

    public static boolean runDice(){
        Random rand = new Random();
        int randNum = rand.nextInt(10);
        if(randNum >= 4){
            return true;
        }
        return false;
    }

    public static void printResult(){
        System.out.println("실행결과");
        for(Map.Entry<String, Integer> entry : gameSnap.entrySet()){
            System.out.print(entry.getKey() + " : ");
            for(int i=0 ; i<entry.getValue() ; i++)
                System.out.print("-");
            System.out.println();
        }
        System.out.println();
    }

    public static void whoIsWinner(){
        int winnerNum = 0;
        for(Map.Entry<String, Integer> entry : gameSnap.entrySet()){
            if(winnerNum < entry.getValue())
                winnerNum = entry.getValue();
        }
        for(Map.Entry<String, Integer> entry : gameSnap.entrySet()){
            if(winnerNum == entry.getValue())
                winnerGroup.add(entry.getKey());
        }
        System.out.println(winnerGroup + "가 최종 우승했습니다.");
    }

    public static void initVar(){
        winnerGroup = new HashSet<>();
        gameSnap = new HashMap<>();
    }

}