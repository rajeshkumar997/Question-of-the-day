import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int operations = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                operations += i;
                n /= i;
            }
        }
        if (n > 1) {
            operations += n;
        }
        System.out.println(operations);
    }
}
