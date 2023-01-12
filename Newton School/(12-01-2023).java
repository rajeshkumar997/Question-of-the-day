import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        long newtonCookies = a - Math.min(a, k);
        long einsteinCookies = b - Math.min(b, k - Math.min(a, k));
        System.out.println(newtonCookies + " " + einsteinCookies);
    }
}
