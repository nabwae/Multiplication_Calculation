package calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultFromScratchTest {
    @Test
    void testValuesFromAssignment(){
        assertEquals( "137174210013717420998628257899862825790", MultFromScratch.scratchMult("12345678901234567890", "11111111111111111111"));
    }
    @Test
    void testNumberTwo(){
        assertEquals( "16942816224", MultFromScratch.scratchMult("789654", "21456"));
    }
    @Test
    void testNumberThree(){
        assertEquals( "40584", MultFromScratch.scratchMult("456", "89"));
    }
}
