import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
       Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(); 
        long x = scanner.nextLong(); 
        String result = isPossible(n, x);
        System.out.println(result);
    }
    
    private static String isPossible(long n, long x) {       
        if (n % 2 == 0) {
            return "Yes";
        }       
        
        if ((n - x) % 2 == 0 && (n - x) >= 0){
            return "Yes";
        }
        return "No";
    }
}
