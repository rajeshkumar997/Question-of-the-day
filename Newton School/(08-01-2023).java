import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
        weights[i] = sc.nextInt();
        }
        int minAbsDiff = Integer.MAX_VALUE;
        for (int x = 1; x < n; x++) {
            int s1 = 0, s2 = 0;
            for (int i = 0; i < x; i++) {
                s1 += weights[i];
            }
            for (int i = x; i < n; i++) {
                s2 += weights[i];
            }
            minAbsDiff = Math.min(minAbsDiff, Math.abs(s1 - s2));
        }
        System.out.println(minAbsDiff);
    }
}
