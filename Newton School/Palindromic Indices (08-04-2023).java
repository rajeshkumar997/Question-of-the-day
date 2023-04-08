import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int count = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(i);
            if (isPalindrome(sb.toString())) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
