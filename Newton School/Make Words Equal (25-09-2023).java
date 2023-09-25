import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        
        String X = scanner.nextLine();
        String Y = scanner.nextLine();
        
        int minChanges = findMinChanges(X, Y);
        
        System.out.println(minChanges);
    }
    
    public static int findMinChanges(String X, String Y) {
        int minLengthDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i <= X.length() - Y.length(); i++) {
            int diffCount = 0;
            for (int j = 0; j < Y.length(); j++) {
                if (X.charAt(i + j) != Y.charAt(j)) {
                    diffCount++;
                }
            }
            minLengthDiff = Math.min(minLengthDiff, diffCount);
        }
        
        return minLengthDiff;
    }
}
