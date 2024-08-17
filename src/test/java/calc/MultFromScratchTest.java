package calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultFromScratchTest {
    @Test
    void testValuesFromAssignment(){
        var MultFromScratch = new MultFromScratch();
        assertEquals( "137174210013717420998628257899862825790", MultFromScratch.scratchMult("12345678901234567890", "11111111111111111111"));
    }
    @Test
    void testNumberTwo(){
        var MultFromScratch = new MultFromScratch();
        assertEquals( "16942816224", MultFromScratch.scratchMult("789654", "21456"));
    }
}
