package calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultFromScratchTest {

    @Test
    void testValuesFromAssignment() {
        assertEquals(
                "137174210013717420998628257899862825790",
                MultFromScratch.scratchMult(
                        "12345678901234567890",
                        "11111111111111111111"
                )
        );
    }

    @Test
    void shouldMultiplySingleDigitNumbers() {
        assertEquals(
                "12",
                MultFromScratch.scratchMult("4", "3")
        );
    }

    @Test
    void shouldMultiplyMultiDigitNumbers() {
        assertEquals(
                "16942816224",
                MultFromScratch.scratchMult("789654", "21456")
        );

        assertEquals(
                "40584",
                MultFromScratch.scratchMult("456", "89")
        );
    }

    @Test
    void shouldReturnZeroWhenFirstNumberIsZero() {
        assertEquals(
                "0",
                MultFromScratch.scratchMult("0", "123456")
        );
    }

    @Test
    void shouldReturnZeroWhenSecondNumberIsZero() {
        assertEquals(
                "0",
                MultFromScratch.scratchMult("4564745", "0")
        );
    }

    @Test
    void shouldReturnZeroWhenBothNumbersAreZero() {
        assertEquals(
                "0",
                MultFromScratch.scratchMult("0", "0")
        );
    }

    @Test
    void shouldMultiplyNegativeAndPositiveNumbers() {
        assertEquals(
                "-839090472",
                MultFromScratch.scratchMult("-577886", "1452")
        );
    }

    @Test
    void shouldMultiplyTwoNegativeNumbers() {
        assertEquals(
                "839090472",
                MultFromScratch.scratchMult("-577886", "-1452")
        );
    }

    @Test
    void shouldMultiplyPositiveAndNegativeNumbers() {
        assertEquals(
                "-839090472",
                MultFromScratch.scratchMult("577886", "-1452")
        );
    }

    @Test
    void shouldHandleLeadingZeroes() {
        assertEquals(
                "123",
                MultFromScratch.scratchMult("00123", "1")
        );

        assertEquals(
                "123",
                MultFromScratch.scratchMult("123", "0001")
        );

        assertEquals(
                "56088",
                MultFromScratch.scratchMult("000123", "000456")
        );
    }
}
