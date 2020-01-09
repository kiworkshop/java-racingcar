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
        String input = "hyundai\r\n3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Test
    public void testGetGameInfo() {
        CarGame game = main.getGameInfo();
        List<String> carNames = Arrays.asList("hyundai");

        assertEquals(game.getCarNames(), carNames);
        assertEquals(game.getTrialNumber(), 3);


    }
}
