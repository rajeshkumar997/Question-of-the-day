import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        int numEvens = 0;
        int numOdds = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                numEvens++;
            } else {
                numOdds++;
            }
        }
        if (numEvens != numOdds) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }
}
