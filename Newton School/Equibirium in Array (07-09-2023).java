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

        int[] leftSum = new int[n];
        leftSum[0] = array[0];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + array[i];
        }

        int rightSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (leftSum[i] == rightSum) {
                System.out.println("Yes");
                return;
            }
            rightSum += array[i];
        }
        System.out.println("No");
    }
}
