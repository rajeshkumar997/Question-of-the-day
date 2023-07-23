import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a+b)%2 != 0 || (b+c)%2 != 0 || (c+a)%2 != 0){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
