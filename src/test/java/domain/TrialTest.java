package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrialTest {

    @Test
    void generateTrialFromString() {
        String number = "5";
        String negativeNumber = "-5";

        Trial trial = new Trial(number);
        assertTrue(trial.getTrial() == 5);
        assertThrows(IllegalArgumentException.class, () -> new Trial(negativeNumber));

        String notNumber = "재주";
        assertThrows(IllegalArgumentException.class, () -> new Trial(notNumber));
    }
}
