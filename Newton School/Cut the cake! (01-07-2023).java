import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long cuts=0;
        if(N==0){
            cuts =0;
        
        }else{
            if((N+1)%2 ==0){
                cuts = (N+1)/2;
            }else{
                cuts = N+1;
            }
        }
        System.out.println(cuts);
    }
}
