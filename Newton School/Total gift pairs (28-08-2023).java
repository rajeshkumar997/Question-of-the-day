import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] gifts = new int[n];
        for (int i = 0; i < n; i++) {
            gifts[i] = scanner.nextInt();
        }
        int couponNumber = scanner.nextInt();

        int[] remainderCount = new int[couponNumber];
        for (int cost : gifts) {
            int remainder = cost % couponNumber;
            remainderCount[remainder]++;
        }
        int totalCount = 0;
        for (int i = 0; i <= couponNumber / 2; i++) {
            int other = (couponNumber - i) % couponNumber;
            if (i == other) {
                totalCount += remainderCount[i] * (remainderCount[i] - 1) / 2; 
            } else {
                totalCount += remainderCount[i] * remainderCount[other];
            }
        }
        System.out.println(totalCount);
    }
}
