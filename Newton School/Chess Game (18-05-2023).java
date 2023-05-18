import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = 2*sc.nextInt();
        int b = sc.nextInt();
        int c = 2*sc.nextInt();
        int d = sc.nextInt();

        if(a+b > c+d){
            System.out.println("Alexa");
        }
        else if(a+b <c+d){
            System.out.println("Bob");
        }
        else{
            System.out.println("Tie");
        }
    }
}
