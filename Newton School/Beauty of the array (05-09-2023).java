import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int result = maxBeautifulSubarrayLength(array);
        System.out.println(result);
    }

    public static int maxBeautifulSubarrayLength(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int maxLength = Math.min(evenCount, oddCount) * 2;
        if (evenCount != oddCount) {
            maxLength++; 
        }
        return maxLength;
    }
}
