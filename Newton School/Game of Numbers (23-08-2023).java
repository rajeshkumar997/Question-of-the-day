import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int k = Math.min(n,m);
        if(k%2 == 1)
            k--;
        n -= k;
        m -= k;
        while(true){
            if(n>0)
                n--;
            else{
                System.out.println("Ram");
                break;
            }
            if(m>0)
                m--;
            else{
                System.out.println("Shyam");
                break;
            }
            if(n>0 && m>0){
                n--;
                m--;
            }
            else{
                System.out.println("Rahul");
                break;
            }
        }
    }
}
