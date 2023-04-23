import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();
        long t = sc.nextLong();

        long a = t/x;
        if(a >= n){
            a = n;
        }
        long temp = n*a - a*(a+1)/2;
        System.out.print(temp);
    }
}
