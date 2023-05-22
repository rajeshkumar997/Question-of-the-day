import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int countOdd = 0, countEven = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        boolean possible = false;
        for (int i = 1; i <= countOdd && i <= x; i += 2) {
            int remaining = x - i;
            if (remaining <= countEven) {
                possible = true;
                break;
            }
        }
        System.out.println(possible ? "Yes" : "No");
    }
}
