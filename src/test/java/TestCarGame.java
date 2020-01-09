import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCarGame {

    @BeforeEach
    public void setUp() {
        String input = "hyundai\r\n3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Test
    public void testGetGameConstructor() {
        CarGame game = new CarGame("hyundai", 3);

        assertEquals(game.getCarName(), "hyundai" );
        assertEquals(game.getTrialNumber(), 3 );
    }

//    @Test
//    public void testGetCarNames() {
//        CarGame game = new CarGame();
//        CarGameInfo gameInfo = game.getGameInfo();
//
//        assertEquals(gameInfo.getCarNames(), ["hyundai", "kia"]);
//    }
//
}
