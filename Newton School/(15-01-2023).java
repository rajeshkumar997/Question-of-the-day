import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        boolean isStrongPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                isStrongPalindrome = false;
                break;
            }
        }
        if (!isStrongPalindrome) {
            System.out.println("No");
            return;
        }
        // Check if the first half is a palindrome
        for (int i = 0; i < (n - 1) / 2; i++) {
            if (s.charAt(i) != s.charAt((n - 1) / 2 - i - 1)) {
                isStrongPalindrome = false;
                break;
            }
        }
        if (!isStrongPalindrome) {
            System.out.println("No");
            return;
        }
        // Check if the second half is a palindrome
        for (int i = (n + 3) / 2 - 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                isStrongPalindrome = false;
                break;
            }
        }
        if (isStrongPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
}
