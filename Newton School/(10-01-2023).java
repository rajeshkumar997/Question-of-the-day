import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static final int MOD = 1000000007;
    public static void main (String[] args) {
        // Your code here
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] broken = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int si = sc.nextInt();
            broken[si] = true;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            if (!broken[i]) {
                dp[i + 1] = (dp[i + 1] + dp[i]) % MOD;
                if (i + 2 <= n) {
                    dp[i + 2] = (dp[i + 2] + dp[i]) % MOD;
                }
            }
        }
        System.out.println(dp[n]);
    }
}
