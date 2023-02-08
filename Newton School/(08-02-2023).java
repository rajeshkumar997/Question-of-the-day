import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
         Scanner sc = new Scanner(System.in);
        int[] P = new int[26];
        for (int i = 0; i < 26; i++) {
            P[i] = sc.nextInt();
        }
        sc.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append((char)('a' + P[i] - 1));
        }
        System.out.println(sb.toString());
    }
}
