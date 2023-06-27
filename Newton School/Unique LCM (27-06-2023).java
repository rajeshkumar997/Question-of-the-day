import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();

        long count = 0;
        for (long i = 1; i * i <= X; i++) {
            if (X % i == 0) {
                count += 2;
            }
        }
        if ((long) Math.sqrt(X) * (long) Math.sqrt(X) == X) {
            count--;
        }
        System.out.println(count);
    }
}
