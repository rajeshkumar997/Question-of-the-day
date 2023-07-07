import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = calculateSumOfOddDigits(n);
        printEightNTimes(sum);
    }
    
    private static int calculateSumOfOddDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 1) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }
    
    private static void printEightNTimes(int n) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append("8");
        }
        System.out.println(sb.toString());
    }
}
