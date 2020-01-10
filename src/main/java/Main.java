public class Main {

    public static void main(String[] args) {
      CarGameStarter gameStarter = new CarGameStarter();
      CarGame carGame = gameStarter.startGame();
      carGame.play();
    }
}
