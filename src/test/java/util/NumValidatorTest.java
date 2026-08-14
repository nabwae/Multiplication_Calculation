package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumValidatorTest {

    @Test
    void shouldRemoveLeadingZeroes() {
        assertEquals("123", NumValidator.removeLeadingZeroes("000123"));
        assertEquals("123", NumValidator.removeLeadingZeroes("00123"));
        assertEquals("123", NumValidator.removeLeadingZeroes("123"));
    }

    @Test
    void shouldKeepSingleZero() {
        assertEquals("0", NumValidator.removeLeadingZeroes("0"));
        assertEquals("0", NumValidator.removeLeadingZeroes("0000"));
    }

    @Test
    void shouldKeepZeroesWhenNumberIsZero() {
        assertEquals("0", NumValidator.removeLeadingZeroes("000"));
    }

    @Test
    void shouldAcceptValidPositiveNumber() {
        assertDoesNotThrow(() -> NumValidator.validateNumber("123456"));
        assertDoesNotThrow(() -> NumValidator.validateNumber("0"));
        assertDoesNotThrow(() -> NumValidator.validateNumber("000123"));
    }

    @Test
    void shouldAcceptValidNegativeNumber() {
        assertDoesNotThrow(() -> NumValidator.validateNumber("-123"));
        assertDoesNotThrow(() -> NumValidator.validateNumber("-0"));
        assertDoesNotThrow(() -> NumValidator.validateNumber("-000123"));
    }

    @Test
    void shouldRejectNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> NumValidator.validateNumber(null)
        );
    }

    @Test
    void shouldRejectEmptyNumber() {
        assertThrows(
                IllegalArgumentException.class,
                () -> NumValidator.validateNumber("")
        );
    }

    @Test
    void shouldRejectNumberContainingOnlyMinusSign() {
        assertThrows(
                IllegalArgumentException.class,
                () -> NumValidator.validateNumber("-")
        );
    }

    @Test
    void shouldRejectNumberContainingLetters() {
        assertThrows(
                IllegalArgumentException.class,
                () -> NumValidator.validateNumber("123a"));
    }

    @Test
    void shouldRejectNumberContainingDecimalPoint() {
        assertThrows(
                IllegalArgumentException.class,
                () -> NumValidator.validateNumber("12.34"));
    }

    @Test
    void shouldRejectNumberContainingSpaces() {
        assertThrows(
                IllegalArgumentException.class,
                () -> NumValidator.validateNumber("123 456"));
    }

    @Test
    void shouldRejectNumberWithMinusSignInWrongPosition() {
        assertThrows(
                IllegalArgumentException.class,
                () -> NumValidator.validateNumber("12-34"));
    }
}
