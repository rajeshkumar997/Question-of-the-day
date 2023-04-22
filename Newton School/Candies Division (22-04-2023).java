import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        int totalWeight = 0;
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            totalWeight += candies[i];
        }
        if (totalWeight % 2 == 1) {
            System.out.println("No");
            return;
        }
        boolean[][] dp = new boolean[n + 1][totalWeight / 2 + 1];
        dp[0][0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= totalWeight / 2; j++) {
                if (candies[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - candies[i - 1]];
                }
            }
        }
        if (dp[n][totalWeight / 2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
