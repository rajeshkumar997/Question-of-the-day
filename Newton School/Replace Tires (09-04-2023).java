import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x, y;
        if (n % 2 == 1 || n < 4) {
            System.out.println("-1");
            return;
        }
        y = n/4;
        x = (n%6 != 0) ? (n/6)+1 : n/6;
        System.out.println(x + " "+ y);
    }
}
