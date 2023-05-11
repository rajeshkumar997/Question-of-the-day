import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        if (m % n != 0 || m < n) {
            System.out.println(-1);
            return;
        }
        int quotient = m / n;
        while (quotient > 1) {
            if (quotient % 2 == 0) {
                quotient /= 2;
                count++;
            } else if (quotient % 3 == 0) {
                quotient /= 3;
                count++;
            } else {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(count);
    }
}
