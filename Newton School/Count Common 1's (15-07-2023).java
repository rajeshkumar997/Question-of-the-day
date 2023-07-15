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

        int count = 0;
        int common = n & m;
        while(common != 0){
            if((common & 1) == 1){
                count++;
            }
            common >>= 1;
        }
        System.out.println(count);
    }
}
