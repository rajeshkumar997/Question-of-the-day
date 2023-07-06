import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n/3;
        n%=3;
        if(n==1){
            if(ans==0)
                System.out.println(2);
            else
                System.out.println(ans+1);
        }else if(n==2)
            System.out.println(ans+1);
        else
            System.out.println(ans);
    }
}
