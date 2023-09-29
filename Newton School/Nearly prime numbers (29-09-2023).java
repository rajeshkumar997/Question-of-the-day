import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        int n = new Scanner(System.in).nextInt();
        boolean[] primes = getPrimes(n);
        boolean[] nearlyPrimes = new boolean[n + 1];
        for (int i = 2; i < n; i++) {
            if (primes[i])
                nearlyPrimes[i - 1] = nearlyPrimes[i + 1] = true;
        }
        if (primes[n])
            nearlyPrimes[n - 1] = true;
        int ans = 0;
        for (int i = 1; i <= n; i++)
        ans += primes[i] || nearlyPrimes[i] ? 1 : 0;
        System.out.println(ans);
    }
    public static boolean[] getPrimes(int n) {
        boolean[] ans = new boolean[n + 1];
        Arrays.fill(ans, true);
        ans[0] = ans[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (ans[i])
                for (int j = i * i; j <= n; j += i)
            ans[j] = false;
        }
        return ans;
    }
}
