package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrialTest {

    @Test
    void generateTrialFromString() {
        int number = 5;
        int negativeNumber = -5;

        Trial trial = Trial.from(number);
        assertTrue(trial.getTrial() == 5);
        assertThrows(IllegalArgumentException.class, () -> Trial.from(negativeNumber));
    }
}
