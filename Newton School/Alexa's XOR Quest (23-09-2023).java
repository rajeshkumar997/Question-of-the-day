import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        long result = calculateXOR(A, B);
        System.out.println(result);sc
    }

    public static long calculateXOR(long A, long B) {
        long resultA = calculateXORFromZero(A - 1);
        long resultB = calculateXORFromZero(B);
        return resultA ^ resultB;
    }
    
    public static long calculateXORFromZero(long N) {
        if (N % 4 == 0) {
            return N;
        } else if (N % 4 == 1) {
            return 1;
        } else if (N % 4 == 2) {
            return N + 1;
        } else {
            return 0;
        }
    }
}
