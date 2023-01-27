import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        sc.close();

        StringBuilder sb = new StringBuilder();
        while (k > 0) {
            if (k % 2 == 0) {
                sb.append("0");
                k /= 2;
            } else {
                sb.append("2");
                k = (k - 1) / 2;
            }
        }
        System.out.println(sb.reverse().toString());
    }
}
