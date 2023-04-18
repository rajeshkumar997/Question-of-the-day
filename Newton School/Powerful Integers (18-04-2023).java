import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPowerful(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static boolean isPowerful(int num) {
        String str = Integer.toString(num);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
