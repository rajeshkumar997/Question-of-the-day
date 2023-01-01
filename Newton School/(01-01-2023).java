import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        double invSum = 0;
        for(int i=0; i<n; i++){
            invSum += 1.0/arr[i];
        }
        double res = 1.0/invSum;
        System.out.printf("%.8f", res);
    }
}
