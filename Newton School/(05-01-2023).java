import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        for (int i = x - k + 1; i <= x + k - 1; i++) {
        System.out.print(i + " ");
        }
    }
}
