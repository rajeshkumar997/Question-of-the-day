import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){a
            arr[i] = sc.nextInt();
        }
        int maxProd = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int product = arr[i - 1] * arr[i];
            maxProd = Math.max(maxProd, product);
        }
        System.out.print(maxProd);
    }
}
