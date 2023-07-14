import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int res = m-n;
        if(res % 2 == 0){
            int res1 = res/2;
            System.out.print(res1);
        }
        if(res % 2 != 0){
            int res2 = (res/2)+1;
            System.out.print(res2);
        }
    }
}
