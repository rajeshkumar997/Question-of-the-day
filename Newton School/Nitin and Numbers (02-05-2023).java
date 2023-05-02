import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int maxDigit = Integer.MIN_VALUE;
        for (int i = 0; i < input.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(input.charAt(i)));
            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }
        System.out.println(maxDigit);
    }
}
