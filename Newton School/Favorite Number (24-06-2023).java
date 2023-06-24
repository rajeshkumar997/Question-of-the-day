import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if (x == 1 && y != 1 || x <=3  && y > 3) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
