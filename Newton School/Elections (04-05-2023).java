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
        int c = sc.nextInt();
        
        int max = Math.max(Math.max(a, b), c); 
        int A = max - a > 0 ? max - a + 1 : 0;
        int B = max - b > 0 ? max - b + 1 : 0;
        int C = max - c > 0 ? max - c + 1 : 0;
        System.out.println(A + " " + B + " " + C);
    }
}
