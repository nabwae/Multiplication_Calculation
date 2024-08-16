import static calc.BigIntegerImplementation.*;

public class Main {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Two numbers are required. One for number representing A and second one representing B.");
        } else {
            System.out.print(multBig(args[0], args[1]));
        }
    }
}