import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        
        long result;
        if (isEven(n)) {
            result = sumOfDigits(n);
        } else {
            result = productOfDigits(n);
        }
        System.out.println(result);
    }
    
    public static boolean isEven(long n) {
        return n % 2 == 0;
    }
    
    public static long sumOfDigits(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    public static long productOfDigits(long n) {
        long product = 1;
        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }
        return product;
    }
}
