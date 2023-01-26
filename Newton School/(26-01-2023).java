import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= N; i++) {
            if(!Integer.toString(i).contains("7") && !Integer.toOctalString(i).contains("7")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
