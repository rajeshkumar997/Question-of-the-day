import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int xor = n^m;
        int diff = 0;
        while(xor != 0){
            diff++;
            xor &= (xor-1);
        }
        System.out.print(diff);
    }
}
