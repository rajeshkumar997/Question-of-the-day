import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // convert string to char array for easier manipulation
        char[] arr = s.toCharArray();
        
        // move everyone to the right, starting from the second square
        for (int i = 3; i >= 1; i--) {
            arr[i] = arr[i-1];
        }
        
        // the rightmost square is now empty
        arr[0] = '0';
        
        // convert char array back to string
        String result = new String(arr);
        System.out.println(result);
    }
}
