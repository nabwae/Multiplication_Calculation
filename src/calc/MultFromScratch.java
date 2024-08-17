// Class with multiplication implemented from scratch

package calc;

import java.util.Arrays;

public class MultFromScratch {
    public static String scratchMult(String num1, String num2){
        int len1 = num1.length();
        int len2 = num2.length();

        // prolly have to store result in an array and somewhat split because it wont even fit into long
        int[] result = new int[len1 + len2];

        // Simulation of calculation on paper we take rightmost number in num2 and multiply it digit by digit with digits from num1 and iterate thru that
        for(int i = len2 - 1; i >= 0; i--){
            int digit2 = Integer.parseInt(String.valueOf(num2.charAt(i)));
            for(int j = len1 - 1; j >= 0; j--){
                int digit1 = Integer.parseInt(String.valueOf(num1.charAt(j)));

                // Multiplication of two digits (from num1 and num2) and adding their sum into result array starting at the last index and moving left
                int prod = digit1 * digit2;
                // Sum our product with carry if its present
                int addition = result[i + j + 1] + prod;
                // We put last digit of multiplication into the array hence % usage, and with / usage we store carry in -1 index
                result[i + j + 1] = addition % 10;
                result[i + j] += addition / 10;
            }
        }

        //System.out.print(Arrays.toString(result));

        // draft in head, will perform digit by digit multiplication with carry, yet to implement
        return Arrays.toString(result);
    }
}
