import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int d = sc.nextInt();

        int res = ((p*d)/100)+p;
        int moneyLoss = res - ((res*d)/100);

        System.out.println((p-moneyLoss)*q);
    }
}
