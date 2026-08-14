// Class with multiplication implemented from scratch

package calc;

import static util.NumValidator.removeLeadingZeroes;
import static util.NumValidator.validateNumber;

public class MultFromScratch {
    public static String scratchMult(String num1, String num2) {

        validateNumber(num1);
        validateNumber(num2);

        boolean negative = false;
        if (num1.charAt(0) == '-') {
            negative = !negative;
            num1 = num1.substring(1);
        }

        if (num2.charAt(0) == '-') {
            negative = !negative;
            num2 = num2.substring(1);
        }

        // Remove leading zeroes
        num1 = removeLeadingZeroes(num1);
        num2 = removeLeadingZeroes(num2);

        // If either number is zero, the result is zero.
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int len1 = num1.length();
        int len2 = num2.length();

        // Array to fit multiplication result even if we have a lot of carries
        int[] result = new int[len1 + len2];

        /*
         * Grade-school multiplication:
         *
         *      123
         *    x 456
         *    -----
         *
         * We multiply every digit of num1 by every digit of num2
         * and place the result at the appropriate position.
         */
        for(int i = len2 - 1; i >= 0; i--) {
            int digit2 = num2.charAt(i) - '0';
            for(int j = len1 - 1; j >= 0; j--) {
                int digit1 = num1.charAt(j) - '0';

                int product = digit1 * digit2;

                int position = i + j + 1;
                int sum = result[position] + product;

                result[position] = sum % 10;
                result[position - 1] += sum / 10;
            }
        }

        final StringBuilder resultString = new StringBuilder();
        boolean leadZeroCheck = true;
        for(int digit : result){
            if(digit == 0 && leadZeroCheck){
                continue;
            }

            leadZeroCheck = false;
            resultString.append(digit);
        }

        if (negative) {
            resultString.insert(0, '-');
        }

        return resultString.toString();
    }
}
