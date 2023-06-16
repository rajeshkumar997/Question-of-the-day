import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        if (N % 2 == 0) {
            while (N % 2 == 0) {
                N /= 2;
            }
        }
        if (N > 1) {
            System.out.println("YES"); 
        } else {
            System.out.println("NO");
        }
    }
}
