import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        int n = new Scanner(System.in).nextInt();
        int c = 0;
        while(true){
            if(isPrime(n))
                c++;
            if(c==2)
                break;
            n--;
        }
        System.out.println(n);
    }
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i = 2; i*i<=n; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
