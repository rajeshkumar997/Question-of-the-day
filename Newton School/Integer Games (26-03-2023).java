import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        Set<Long> set = new HashSet<>();
        for (long a = 2; a * a <= n; a++) {
            for (long b = 2; Math.pow(a, b) <= n; b++) {
            set.add((long) Math.pow(a, b));
            }
        }
        System.out.println(n - set.size());
    }
}
