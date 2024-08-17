package calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultBigIntegerTest {
    @Test
    void testValuesFromAssignment(){
        String multBigOutput = String.valueOf(MultBigInteger.multBig("12345678901234567890", "11111111111111111111"));
        assertEquals( "137174210013717420998628257899862825790", multBigOutput);
    }
    @Test
    void testNumberTwo(){
        String multBigOutput = String.valueOf(MultBigInteger.multBig("789654", "21456"));
        assertEquals( "16942816224", multBigOutput);
    }
    @Test
    void testNumberThree(){
        String multBigOutput = String.valueOf(MultBigInteger.multBig("456", "89"));
        assertEquals( "40584", multBigOutput);
    }
    @Test
    void testNumberFour(){
        String multBigOutput = String.valueOf(MultBigInteger.multBig("4564745", "0"));
        assertEquals( "0", multBigOutput);
    }

}
