import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int minStamina = Integer.MAX_VALUE;
        for (int p = x[0]; p <= x[n - 1]; p++) {
            int stamina = 0;
            for (int i = 0; i < n; i++) {
                stamina += (x[i] - p) * (x[i] - p);
            }
            minStamina = Math.min(minStamina, stamina);
        }
        System.out.println(minStamina);
    }
}
