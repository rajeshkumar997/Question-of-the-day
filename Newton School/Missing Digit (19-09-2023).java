import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (char digit : digits) {
            if (str.indexOf(digit) == -1) {
                System.out.println(digit);
                break;
            }
        }
    }
}
