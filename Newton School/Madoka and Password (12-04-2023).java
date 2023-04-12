import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String ans;
        if(n%3 == 0){
            ans = "21".repeat(n/3);
        }
        else if (n%3 == 1){
            ans = "12".repeat(n/3)+"1";
        }
        else {
            ans = "21".repeat(n/3)+"2";
        }
        System.out.println(ans);
    }
}
