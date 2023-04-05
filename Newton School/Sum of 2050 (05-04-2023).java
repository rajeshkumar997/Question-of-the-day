import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        if(n % 2050 != 0) {
            System.out.println("-1");
        } else {
            long k = n / 2050;
            int count = 0;
            while(k > 0) {
                count += k % 10;
                k /= 10;
            }
            System.out.println(count);
        }
    }
}
