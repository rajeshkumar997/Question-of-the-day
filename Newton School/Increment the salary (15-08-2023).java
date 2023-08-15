import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
        }
        
        if (carry == 1) {
            int[] newarr = new int[n + 1];
            newarr[0] = 1;
            for (int i = 1; i <= n; i++) {
                newarr[i] = arr[i - 1];
            }
            arr = newarr;
        }
        for (int digit : arr) {
            System.out.print(digit);
        }
    }
}
