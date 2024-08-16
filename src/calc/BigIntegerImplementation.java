// Class with multBig method to multiply two integers using BigInteger

package calc;

import java.math.BigInteger;

public class BigIntegerImplementation {
    public static BigInteger multBig(String A, String B){
        // Store values of A and B from args/userInput
        BigInteger num1 = new BigInteger(String.valueOf(A));
        BigInteger num2 = new BigInteger(String.valueOf(B));
        // BigInteger object to store result of multiplication
        BigInteger result;
        // Calculation of result using BigInteger, could be simplified and performed just using: return num1.multiply(num2);
        result = num1.multiply(num2);
        return result;
    }
}
