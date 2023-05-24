import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Set<Integer> oddNumbers = new HashSet<>();
        for (int i = 1; i <= 1000; i += 2) {
            oddNumbers.add(i);
        }

        boolean possible = isPossibleSum(n, k, oddNumbers);
        String result = possible ? "YES" : "NO";
        System.out.println(result);
    }

    private static boolean isPossibleSum(int n, int k, Set<Integer> oddNumbers) {
        if (k == 1) {
            return oddNumbers.contains(n);
        }
        for (int i = 1; i <= 1000; i += 2) {
            if (oddNumbers.contains(n - i)) {
                int remainingSum = n - i;
                if (countDistinctOddNumbers(remainingSum, k - 1, oddNumbers)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean countDistinctOddNumbers(int n, int count, Set<Integer> oddNumbers) {
        if (count == 0) {
            return n == 0;
        }
        for (int i = 1; i <= 1000; i += 2) {
            if (oddNumbers.contains(i) && n >= i) {
                int remainingSum = n - i;
                if (countDistinctOddNumbers(remainingSum, count - 1, oddNumbers)) {
                    return true;
                }
            }
        }
        return false;
    }
}
