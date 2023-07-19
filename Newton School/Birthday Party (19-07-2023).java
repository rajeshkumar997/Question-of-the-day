import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long res = 0;
        if (n % 2 == 0 && k % 2 != 0) {
            res = (n * k) / k;
        } else {
            res = (n + k - 1) / k;
        }
        System.out.println(res);
    }
}
