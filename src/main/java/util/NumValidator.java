package util;

public class NumValidator {

    public static String removeLeadingZeroes(final String number) {
        int index = 0;

        while (index < number.length() - 1 && number.charAt(index) == '0') {
            index++;
        }

        return number.substring(index);
    }

    public static void validateNumber(final String number) {
        if (number == null || number.isEmpty()) {
            throw new IllegalArgumentException("Number cannot be empty.");
        }

        int start = number.charAt(0) == '-' ? 1 : 0;

        if (start == number.length()) {
            throw new IllegalArgumentException("Invalid number: " + number);
        }

        for (int i = start; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) {
                throw new IllegalArgumentException("Invalid number: " + number);
            }
        }
    }
}
