import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int l = str.length();
        int ans = 0;
        for (int i = 0; i < l / 2; i++) {
            if (str.charAt(i) != str.charAt(l - i - 1)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
