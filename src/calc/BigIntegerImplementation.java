// Class with multBig method to multiply two integers using BigInteger

package calc;

import java.math.BigInteger;

public class BigIntegerImplementation {
    public static BigInteger multBig(String num1, String num2){
        // Store values of A and B from args/userInput
        BigInteger numB1 = new BigInteger(String.valueOf(num1));
        BigInteger numB2 = new BigInteger(String.valueOf(num2));
        // BigInteger object to store result of multiplication
        BigInteger resultB;
        // Calculation of result using BigInteger, could be simplified and performed just using: return numB1.multiply(numB2);
        resultB = numB1.multiply(numB2);
        return resultB;
    }
}
