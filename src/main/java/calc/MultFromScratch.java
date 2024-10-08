// Class with multiplication implemented from scratch

package calc;

public class MultFromScratch {
    public static String scratchMult(String num1, String num2){
        // Implementation of check that checks whether there is minus symbol in the numbers, if it is then increment negative counter
        // Later we use counter to represent positive result if negativeCounter == 0 || 2, negative result if negativeCounter == 1
        int negativeCounter = 0;
        if(String.valueOf(num1.charAt(0)).equals("-")){
            negativeCounter += 1;
            num1 = num1.substring(1);
        }
        if(String.valueOf(num2.charAt(0)).equals("-")){
            negativeCounter += 1;
            num2 = num2.substring(1);
        }

        int len1 = num1.length();
        int len2 = num2.length();

        // Array to fit multiplication result even if we have a lot of carries
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
        StringBuilder resultString = new StringBuilder();
        // We check for leading zeroes, if they are present we do not append them, first non-zero sets the check to false
        boolean leadZeroCheck = true;
        for(int i : result){
            if(i == 0 && leadZeroCheck){
                continue;
            }
            if(negativeCounter == 1){ // If one number was negative we append - symbol (Implementation above)
                negativeCounter = 0;
                resultString.append("-");
            }
            leadZeroCheck = false;
            resultString.append(i);
        }
        // Return 0 if string is empty because all zeros got removed in StringBuilder
        if(resultString.isEmpty()){
            return "0";
        }
        // If it is not empty return result
        return String.valueOf(resultString);
    }
}
