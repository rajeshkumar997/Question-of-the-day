import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result = f(f(f(t)+t)+f(f(t)));
        System.out.println(result);
    }
    
    public static int f(int x) {
        return x*x + 2*x + 3;
    }
}
