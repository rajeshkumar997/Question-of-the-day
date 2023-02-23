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
        int ans = -1;
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
