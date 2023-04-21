import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            long min = a[i];
            int maxElement = a[i];
            for (int j = i + 1; j < n; j++) {
                maxElement = Math.max(maxElement, a[j]);
                min = Math.min(min, a[j]);
                max = Math.max(max, maxElement * min);
            }
        }
        System.out.println(max);
    }
}
