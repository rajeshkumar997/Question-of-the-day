import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int stops = 0;
        int skipped = 0;
        int i = 1;
        
        while (skipped < n) {
            stops++;
            skipped += i;
            i++;
        }
        System.out.println(stops);
    }
}
