import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = 1;
        while ((x & y) == 0 || (x ^ y) == 0) {
            y++;
        }
        System.out.println(y);
    }
}
