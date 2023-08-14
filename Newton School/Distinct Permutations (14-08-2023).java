import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int distinctPermutations = countDistinctPermutations(s);
        System.out.println(distinctPermutations);
    }

    public static int countDistinctPermutations(String s) {
        int n = s.length();
        int[] frequency = new int[26];
        
        for (int i = 0; i < n; i++) {
            frequency[s.charAt(i) - 'a']++;
        }
        int totalPermutations = factorial(n);
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 1) {
                totalPermutations /= factorial(frequency[i]);
            }
        }
        return totalPermutations;
    }
    
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
