package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testMultiplyString() {
        int number = 5;
        String delimiter = "-";
        assertTrue(StringUtils.multiply(delimiter, number).equals("-----"));

    }
}