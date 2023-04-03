import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        boolean canConstruct = canConstruct(a, b);
        if (canConstruct) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    public static boolean canConstruct(String a, String b) {
        int[] count = new int[26];
        for (char c : b.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : a.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
