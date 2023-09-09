import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = countValidPermutations(N);
        System.out.println(count);
    }

    public static int countValidPermutations(int N) {
        if (N == 2) {
            return 1;
        }

        int[] dp = new int[N + 1];
        dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i <= N; i++) {
            dp[i] = (i - 1) * (dp[i - 1] + dp[i - 2]);
        }
        return dp[N];
    }
}
