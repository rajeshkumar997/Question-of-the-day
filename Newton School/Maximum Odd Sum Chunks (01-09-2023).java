import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), odd = sc.nextInt();
        int even = n - odd;
        int ans = Math.min(even,odd);
        odd -= ans; even -= ans;
        if(odd>0)
            ans += odd/3;
        System.out.println(ans);
    }
}
