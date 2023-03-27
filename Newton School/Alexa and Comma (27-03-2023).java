import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();

    long ans=0;
    if(n>=1000)ans+=n-999;
    if(n>=1000000)ans+=n-999999;
    if(n>=1000000000)ans+=n-999999999;
    if(n>=1000000000000l)ans+=n-999999999999l;
    if(n>=1000000000000000l)ans+=n-999999999999999l;
    System.out.println(ans);
    }
}
