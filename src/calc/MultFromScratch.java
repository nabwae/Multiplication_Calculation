// Class with multiplication implemented from scratch

package calc;

public class MultFromScratch {
    public static long scratchMult(String num1, String num2){
        int len1 = num1.length();
        int len2 = num2.length();

        // prolly have to store result in an array and somewhat split because it wont even fit into long
        int[] result = new int[len1 + len2];

        for(int i = len1 - 1; i >= 0; i--){
            int digit2 = Integer.parseInt(String.valueOf(num2.charAt(i)));
            for(int j = len2 - 1; j >= 0; j--){
                int digit1 = Integer.parseInt(String.valueOf(num1.charAt(j)));

            }
        }





        // draft in head, will perform digit by digit multiplication with carry, yet to implement
        return 0;
    }
}
