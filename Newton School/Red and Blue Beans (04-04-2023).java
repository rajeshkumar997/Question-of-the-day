import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();

        if (Math.abs(r - b) <= d * Math.max(1, Math.min(r, b))){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
