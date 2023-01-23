import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean flag = false;
        for (int i = 0; i <= s.length() - t.length(); i++) {
            if (s.substring(i, i + t.length()).equals(t)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
