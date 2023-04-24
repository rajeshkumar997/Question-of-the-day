import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        
        while (sum >= 10) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }
        System.out.println(sum);
    }
}
