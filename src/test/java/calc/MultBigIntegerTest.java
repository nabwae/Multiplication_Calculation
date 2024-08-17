package calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultBigIntegerTest {
    @Test
    void testValuesFromAssignment(){
        var bigInteger = new MultBigInteger();
        String multBigOutput = String.valueOf(bigInteger.multBig("12345678901234567890", "11111111111111111111"));
        assertEquals( "137174210013717420998628257899862825790", multBigOutput);
    }
    @Test
    void testNumberTwo(){
        var bigInteger = new MultBigInteger();
        String multBigOutput = String.valueOf(bigInteger.multBig("789654", "21456"));
        assertEquals( "16942816224", multBigOutput);
    }
}
