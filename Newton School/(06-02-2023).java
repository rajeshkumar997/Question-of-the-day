import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = (char) (s.charAt(i) + n);
            if (c > 'Z') {
                c = (char) (c - 26);
            }
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
