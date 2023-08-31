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
        
        Arrays.sort(arr);
        long maxProduct = Long.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            long product = (long) arr[i] * arr[i + 1]; 
            maxProduct = Math.max(maxProduct, product); 
        }
        System.out.println(maxProduct);
    }
}
