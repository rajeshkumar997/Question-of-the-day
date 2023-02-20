import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n / 100;
        int y = (n / 10) % 10;
        int z = n % 10;
        int result = x*100 + y*10 + z + y*100 + z*10 + x + z*100 + x*10 + y;
        System.out.println(result);
    }
}
