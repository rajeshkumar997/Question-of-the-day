import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        for (int i = 0; i < 6; i++) {
            ans += s.charAt(i % s.length());
        }
        System.out.println(ans);
    }
}
