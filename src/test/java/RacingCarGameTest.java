import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RacingCarGameTest {
    private CarGame game;

    @BeforeAll
    public static void setUp() {
        CarGame game = new CarGame();
    }

    @Test
    public void getCarNameTest() {
        CarGame game = new CarGame();
        assertTrue(game.getCarName() == "hyundai");
    }

    @Test
    public void getTrialNumber() {
        CarGame game = new CarGame();
        assertTrue(game.getTrialNumber() == 3);
    }

    @Test
    public void getGameInfo() {
        CarGame game = new CarGame();
        assertTrue(game.getCarName() == "hyundai" && game.getTrialNumber() == 3);
    }
}
