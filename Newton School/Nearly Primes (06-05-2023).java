import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isNearlyPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isNearlyPrime(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && isPrime(i)) {
                count++;
                if (count > 2) {
                    return false;
                }
            }
        }
        return count == 2;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
