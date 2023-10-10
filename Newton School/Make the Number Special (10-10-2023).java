import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        int operations = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            char digit = num.charAt(i);
            if (digit == '0' || digit == '5') {
                break;  
            }
            operations++;
        }
        System.out.println(operations);
    }
}
