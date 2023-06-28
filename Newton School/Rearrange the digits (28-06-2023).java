import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        String numString = Long.toString(number);
        StringBuilder oddDigits = new StringBuilder();
        StringBuilder evenDigits = new StringBuilder();

        for (char digit : numString.toCharArray()) {
            if (Character.getNumericValue(digit) % 2 == 0) {
                evenDigits.append(digit);
            } else {
                oddDigits.append(digit);
            }
        }
        String rearrangedNumber = oddDigits.toString() + evenDigits.toString();
        System.out.println(rearrangedNumber);
    }
}
