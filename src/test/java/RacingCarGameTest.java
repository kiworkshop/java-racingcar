import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarGameTest {

    @Test
    void testSplitNames() {
        String[] targetCarNames = {"a", "b", "c"};
        String testString = "a,b,c";
        String[] splitedCarNames =  RacingCarGame.makeCarNames(testString);
        assertEquals(true, Arrays.equals(splitedCarNames,targetCarNames));
    }

}