import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = n-(a+b);
        if (a > b && a > res) {
            System.out.println(a);
        } else if (b > a && b > res) {
            System.out.println(b);
        } else {
            System.out.println(res);
        }
    }
}
