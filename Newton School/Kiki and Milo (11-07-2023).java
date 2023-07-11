import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int i = 1, j = 2;
        while(a>=i && b>=j){
            a-=i;
            i+=2;
            b-=j;
            j+=2;
        }
        if(a-i<0)
            System.out.println("Milo");
        else
            System.out.println("Kiki");
    }
}
