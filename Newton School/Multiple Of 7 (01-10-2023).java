import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
       int k = new Scanner(System.in).nextInt();
        int i = 1;
        long num = 7;
        while(true){
            if(num%k == 0){
                System.out.println(i);
                break;
            }
            num %= k;
            num = 10*num + 7;
            i++;
            if(i>k){
                System.out.println(-1);
                break;
            }
        }
    }
}
