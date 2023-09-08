import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] path = new int[n];
        for (int i = 0; i < n; i++) {
            path[i] = scanner.nextInt();
        }

        int maxConsecutiveHoles = 0;
        int currentConsecutiveHoles = 0;

        for (int i = 0; i < n; i++) {
            if (path[i] == 0) {
                currentConsecutiveHoles++;
                maxConsecutiveHoles = Math.max(maxConsecutiveHoles, currentConsecutiveHoles);
            } else {
                currentConsecutiveHoles = 0;
            }
        }
        System.out.println(maxConsecutiveHoles);
    }
}
