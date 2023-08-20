import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int X = -1, Y = -1;
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            if (i % c == 0 && (i < a || i > b)) {
                if (X == -1) {
                    X = i;
                } else if (Y == -1) {
                    Y = i;
                    break;
                }
            }
        }
        System.out.println(X + " " + Y);
    }
}
