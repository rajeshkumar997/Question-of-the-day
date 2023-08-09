import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        
        boolean isPowerOfTwo = (x > 0) && ((x & (x - 1)) == 0);
        System.out.println(isPowerOfTwo);
    }
}
