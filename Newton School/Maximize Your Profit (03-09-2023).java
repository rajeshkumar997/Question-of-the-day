import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            int currentProfit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
        }
        System.out.println(maxProfit);
    }
}
