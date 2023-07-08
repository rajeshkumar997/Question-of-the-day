import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int p = sc.nextInt();
        int y = sc.nextInt();
        int q = sc.nextInt();

        if((x/p) == (y/q)){
            System.out.println("Equal");
        }
        else if((x/p) > (y/q)){
            System.out.println("Ram");
        }
        else{
            System.out.println("Shyam");
        }
    }
}
