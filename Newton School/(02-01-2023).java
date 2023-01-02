import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
        String s = sc.next();
        if (a < 3200) {
            System.out.println("red");
        } 
        else {
            System.out.println(s);
        }
    }
}
