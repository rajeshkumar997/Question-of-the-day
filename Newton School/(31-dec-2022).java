import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        double ans = a[0];
        for (int i = 1; i < n; i++) {
            ans = (ans + a[i]) / 2;
        }
       System.out.printf("%.8f", ans);
    }
}
