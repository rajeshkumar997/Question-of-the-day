import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        while (n != 1) {
            if (n % 6 == 0) {
                n /= 6;
            } else {
                n *= 2;
            }
            count++;
            if (n < 1) { 
                System.out.println("-1");
                return;
            }
        }
        System.out.println(count);
    }
}
