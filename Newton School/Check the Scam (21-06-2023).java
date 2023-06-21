import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        boolean isScam = false;
        if (A > B + C + D || B > A + C + D || C > A + B + D || D > A + B + C) {
            isScam = true;
        }
        if (isScam) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
