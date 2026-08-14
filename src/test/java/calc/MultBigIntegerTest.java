package calc;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultBigIntegerTest {

    @Test
    void testValuesFromAssignment() {
        String multBigOutput = String.valueOf(
                MultBigInteger.multBig(
                        "12345678901234567890",
                        "11111111111111111111"
                )
        );

        assertEquals(
                "137174210013717420998628257899862825790",
                multBigOutput
        );
    }

    @Test
    void testAlgsAgainstEachOther() {
        String multBigOutput = String.valueOf(
                MultBigInteger.multBig(
                        "12345678901234567890",
                        "11111111111111111111"
                )
        );

        assertEquals(
                MultFromScratch.scratchMult(
                        "12345678901234567890",
                        "11111111111111111111"
                ),
                multBigOutput
        );
    }

    @Test
    void shouldMultiplySingleDigitNumbers() {
        assertEquals(
                BigInteger.valueOf(12),
                MultBigInteger.multBig("4", "3")
        );
    }

    @Test
    void shouldMultiplyMultiDigitNumbers() {
        assertEquals(
                new BigInteger("16942816224"),
                MultBigInteger.multBig("789654", "21456")
        );

        assertEquals(
                new BigInteger("40584"),
                MultBigInteger.multBig("456", "89")
        );
    }

    @Test
    void shouldReturnZeroWhenFirstNumberIsZero() {
        assertEquals(
                BigInteger.ZERO,
                MultBigInteger.multBig("0", "123456")
        );
    }

    @Test
    void shouldReturnZeroWhenSecondNumberIsZero() {
        assertEquals(
                BigInteger.ZERO,
                MultBigInteger.multBig("123456", "0")
        );
    }

    @Test
    void shouldReturnZeroWhenBothNumbersAreZero() {
        assertEquals(
                BigInteger.ZERO,
                MultBigInteger.multBig("0", "0")
        );
    }

    @Test
    void shouldMultiplyNegativeAndPositiveNumbers() {
        assertEquals(
                new BigInteger("-839090472"),
                MultBigInteger.multBig("-577886", "1452")
        );
    }

    @Test
    void shouldMultiplyTwoNegativeNumbers() {
        assertEquals(
                new BigInteger("839090472"),
                MultBigInteger.multBig("-577886", "-1452")
        );
    }

    @Test
    void shouldMultiplyPositiveAndNegativeNumbers() {
        assertEquals(
                new BigInteger("-839090472"),
                MultBigInteger.multBig("577886", "-1452")
        );
    }

    @Test
    void shouldHandleLeadingZeroes() {
        assertEquals(
                new BigInteger("123"),
                MultBigInteger.multBig("00123", "1")
        );

        assertEquals(
                new BigInteger("123"),
                MultBigInteger.multBig("123", "0001")
        );

        assertEquals(
                new BigInteger("56088"),
                MultBigInteger.multBig("000123", "000456")
        );
    }
}