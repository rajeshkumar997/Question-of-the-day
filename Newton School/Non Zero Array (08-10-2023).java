import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int zero = 0, neg = 0, pos = 0, cur;
        for(int i = 0; i<n; i++){
            cur = sc.nextInt();
            if(cur == 0)
                zero++;
            else if (cur < 0)
                neg += cur;
            else
                pos += cur;
        }
        int ans = zero;
        pos += zero;
        if(pos + neg == 0){
            ans ++;
        }
        System.out.println(ans);
    }
}
