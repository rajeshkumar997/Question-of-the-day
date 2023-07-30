import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        int N, X, Y;
        N = scanner.nextInt();
        X = scanner.nextInt();
        Y = scanner.nextInt();

        int totalCapacity = (N * Y);

        if (totalCapacity >= X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
