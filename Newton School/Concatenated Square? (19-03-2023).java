import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = Integer.parseInt(a + "" + b);
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
