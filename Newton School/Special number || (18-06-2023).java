import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N > 45) {
            System.out.println(-1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int digit = 9;
        while (N > 0) {
            if (N >= digit) {
                sb.append(digit);
                N -= digit;
            }
            digit--;
        }
        System.out.println(sb.reverse().toString());
    }
}
