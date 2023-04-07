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
        int sum = 0;
        for (int i = 0; i < n; i++) {
          sum += arr[i];
        }
        if (sum % n != 0) {
          System.out.println("No");
          return;
        }
        int target = sum / n;
        for (int i = 0; i < n; i++) {
          if (arr[i] == target) {
            System.out.println("Yes");
            return;
          }
        }
        System.out.println("No");
    }
}
