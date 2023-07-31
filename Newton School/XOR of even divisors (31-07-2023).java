import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i % 2 == 0) {
                    result ^= i;
                }
                int quotient = n / i;
                if (quotient != i && quotient % 2 == 0) {
                    result ^= quotient;
                }
            }
        }
        if (n % 2 == 0) {
            result ^= n;
        }
        System.out.println(result);
    }
}
