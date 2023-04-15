import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        Arrays.sort(prices);
        int maxBars = 0;
        int moneySpent = 0;
        for (int i = 0; i < n; i++) {
            if (prices[i] >= l && prices[i] <= r && moneySpent + prices[i] <= k) {
                maxBars++;
                moneySpent += prices[i];
            }
        }
        System.out.println(maxBars);
    }
}
