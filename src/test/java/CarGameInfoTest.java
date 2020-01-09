import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarGameInfoTest {
    private CarGame game;

    @BeforeEach
    public void setUp() {
        String input = "hyundai\r\n3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Test
    public void testGetGameInfo() {
        CarGame game = new CarGame();
        CarGameInfo gameInfo = game.getGameInfo();

        assertEquals(gameInfo.getCarName(), "hyundai" );
        assertEquals(gameInfo.getTrialNumber(), 3 );
    }

//    @Test
//    public void testGetCarNames() {
//        CarGame game = new CarGame();
//        CarGameInfo gameInfo = game.getGameInfo();
//
//        assertEquals(gameInfo.getCarNames(), ["hyundai", "kia"]);
//    }
//
    @Test
    public void testCar() {

    }


}
