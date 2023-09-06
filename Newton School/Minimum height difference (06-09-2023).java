import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 0;
        for(int i = 0; i<n; i++)
            s += sc.nextInt();
        System.out.println(s%n == 0 ? 0 : 1);
    }
}
