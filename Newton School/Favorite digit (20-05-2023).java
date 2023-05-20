import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int d = sc.nextInt();
        
        for (int i = 0; i < q; i++) {
            int ai = sc.nextInt();
            boolean possible = isPossible(ai, d);
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    public static boolean isPossible(int num, int d) {
        int remainingDigits = num;
        while (remainingDigits >= d) {
            if (remainingDigits % 10 == d) {
                return true;
            }
            remainingDigits /= 10;
        }
        
        for (int i = 1; i * d <= num; i++) {
            int sum = i * d;
            int remaining = num - sum;
            if (containsDigit(remaining, d)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean containsDigit(int num, int d) {
        while (num > 0) {
            if (num % 10 == d) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
