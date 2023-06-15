import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long lcm(long a, long b){
        long a1 = a, b1 = b;
        while(b > 0){
            long temp = a % b;
            a = b;
            b = temp;
        }
        return (a1/a)*b1;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long ans = sc.nextLong();
            for(int i=1; i<n; i++){
                ans = lcm(ans,sc.nextInt());
            }
            System.out.println(ans);
        }
    }
}
