import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

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
        List<String> carNames = Arrays.asList("hyundai");
        CarGame game = new CarGame(carNames, 3);

        assertEquals(game.getCarNames(), carNames );
        assertEquals(game.getTrialNumber(), 3 );
    }

    @Test
    public void testGetCarNames() {
        List<String> carNames = Arrays.asList("hyundai","kia");
        CarGame game = new CarGame(carNames, 3);

        assertEquals(game.getCarNames(), carNames);
    }

}
