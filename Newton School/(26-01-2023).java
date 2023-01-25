import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        while(A < B) {
            A *= K;
            count++;
        }
        System.out.println(count);
    }
}
