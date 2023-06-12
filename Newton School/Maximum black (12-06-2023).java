import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                grid[i][j] = row.charAt(j);
            }
        }
        int maxConsecutive = 0;
        for (int i = 0; i < n; i++) {
            int consecutive = 0;
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '#') {
                    consecutive++;
                } else {
                    maxConsecutive = Math.max(maxConsecutive, consecutive);
                    consecutive = 0;
                }
            }
            maxConsecutive = Math.max(maxConsecutive, consecutive);
        }
        System.out.println(maxConsecutive);
    }
}
