import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] dp = new int[n];
        dp[0] = 1;  
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k && j <= i; j++) {
                dp[i] = (dp[i] + dp[i - j]) % 1000000007;
            }
        }
        System.out.println(dp[n-1]);
    }
}
