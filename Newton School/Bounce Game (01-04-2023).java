import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] lengths = new int[n];
        for (int i = 0; i < n; i++) {
            lengths[i] = sc.nextInt();
        }
        int bounceCount = 0;
        int currentCoord = 0;
        for (int i = 0; i <= n; i++) {
            if (currentCoord <= x) {
                bounceCount++;
            }
            if (i < n) {
                currentCoord += lengths[i];
            }
        }
        System.out.println(bounceCount);
    }
}
