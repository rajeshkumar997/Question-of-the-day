import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    private static String digitToWord(int digit) {
        switch (digit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String str = Long.toString(N);

        if (N % 2 == 0) {
            for (int i = 0; i < str.length(); i++) {
                int digit = Character.getNumericValue(str.charAt(i));
                System.out.print(digitToWord(digit) + " ");
            }
        } else {
            for (int i = str.length() - 1; i >= 0; i--) {
                int digit = Character.getNumericValue(str.charAt(i));
                System.out.print(digitToWord(digit) + " ");
            }
        }
    }
}
