import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double s1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double s2 = sc.nextDouble();

        double time = (d1/s1)+(d2/s2);
        double distance = d1 + d2;

        System.out.printf("%.2f",(distance/time));
    }
}
