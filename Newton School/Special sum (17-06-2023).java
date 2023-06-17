import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long sum = 0;

        for (int i = 1; i <= N; i++) {
            if ((i & (i - 1)) == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
