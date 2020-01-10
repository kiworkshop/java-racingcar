import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @BeforeEach
    public void setUp() {
        String input = "hyundai,kia,bmw\r\n5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Test
    public void testGetGameInfo() {
        CarGame game = main.getGameInfo();
        game.prepareCars();

        assertEquals(game.getCars().get(0).getName(), "hyundai");
        assertEquals(game.getTrialNumber(), 3);
    }

    @Test
    public void testMain() {
        main main = new main();
        main.main();
    }
}
