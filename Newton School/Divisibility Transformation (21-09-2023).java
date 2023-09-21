import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }

        long moves = 0;

        for (int num : A) {
            int remainder = num % K;
            if (remainder != 0) {
                int decreaseMoves = remainder;
                int increaseMoves = K - remainder;
                moves += Math.min(decreaseMoves, increaseMoves);
            }
        }
        System.out.println(moves);
    }
}
