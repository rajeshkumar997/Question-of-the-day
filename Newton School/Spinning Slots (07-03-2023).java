import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) {
            System.out.println("Won");
        } 
        else {
            System.out.println("Lost");
        }
    }
}
