import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        // Check if the length of the string is even
        if (n % 2 == 0) {
            String s1 = s.substring(0, n / 2);
            String s2 = s.substring(n / 2);

            // Check if s1 equals s2
            if (s1.equals(s2)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
