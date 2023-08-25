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
        
        int commonDiff = (arr[n - 1] - arr[0]) / n;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[0] + i * commonDiff) {
                System.out.println(arr[0] + i * commonDiff);
                return;
            }
        }
        System.out.println(arr[n - 1] + commonDiff);
    }
}
