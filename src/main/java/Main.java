// Richard S. - Multiplication Calculation

import static calc.MultBigInteger.*;
import static calc.MultFromScratch.*;

public class Main {
    public static void main(String[] args) {
        if(args.length != 3) {
            // If user did not specify 3 arguments, print warning and usage info
            System.out.println("Invalid number of arguments used. Usage: --alg1/--alg2 <num1> <num2>");
        } else {
            // Load args
            String algorithm = args[0];
            String num1 = args[1];
            String num2 = args[2];

            switch(algorithm){
                case "--alg1": // Call multiplication using BigInteger
                    System.out.println(multBig(num1, num2));
                    break;
                case "--alg2": // Call multiplication using implementation from scratch
                    System.out.println(scratchMult(num1, num2));
                    break;
                default: // Warn user if algorithm (args[0]) does not match --alg1 or --alg2
                    System.out.println("Invalid algorithm choice. Usage: --alg1 or --alg2");
                    break;
            }
        }
    }
}