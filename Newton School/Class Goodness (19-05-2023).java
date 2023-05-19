import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner ac = new Scanner(System.in);
        int n = ac.nextInt();
        int x = ac.nextInt();
        
        int goodness = n | x;
        System.out.println(goodness);
    }
}
