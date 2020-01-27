package domain.strategy;

import domain.strategy.RandomNumberGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomNumberGeneratorTest {

    @Test
    void generateRnadomNumber() {
        int number = RandomNumberGenerator.generateNumber();
        assertTrue(0 <= number && number <= 9);
    }
}
