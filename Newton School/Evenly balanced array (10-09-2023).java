import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int evenDivisors = 0;
            int oddDivisors = 0;
        
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    if (j % 2 == 0) {
                        evenDivisors++;
                    } else {
                        oddDivisors++;
                    }
                }
            }
            if (evenDivisors >= oddDivisors) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
