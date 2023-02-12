import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        String T = scan.nextLine();
        int sLen = S.length();
        int tLen = T.length();
        int result = tLen;
        for (int i = 0; i < sLen - tLen + 1; i++) {
            int cnt = 0;
            for (int j = 0; j < tLen; j++) {
                if (S.charAt(i + j) != T.charAt(j)) {
                    cnt++;
                }
            }
            result = Math.min(result, cnt);
        }
        System.out.println(result);
    }
}
