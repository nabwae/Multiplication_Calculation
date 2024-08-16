// Richard S. - Multiplication Calculation

import static calc.BigIntegerImplementation.*;
import static calc.MultFromScratch.*;

public class Main {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Two numbers are required. One for number representing A and second one representing B.");
        } else {
            System.out.println(multBig(args[0], args[1]));
        //    System.out.println(scratchMult(args[0], args[1]));
        }
    }
}