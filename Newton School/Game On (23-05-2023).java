import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     static boolean isValidMove(int[][] grid, int row, int col) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][col] == 1 || grid[row][i] == 1)
                return false;
        }
        return true;
    }

    static String predictWinner(int[][] grid) {
        int rowCount = grid.length;
        int colCount = grid[0].length;
        int totalMoves = rowCount + colCount;
        int aliceMoves = 0;

        for (int move = 0; move < totalMoves; move++) {
            if (move % 2 == 0) {
                boolean aliceCanMove = false;
                for (int row = 0; row < rowCount; row++) {
                    for (int col = 0; col < colCount; col++) {
                        if (grid[row][col] == 0 && isValidMove(grid, row, col)) {
                            aliceCanMove = true;
                            grid[row][col] = 1;
                            aliceMoves++;
                            break;
                        }
                    }
                    if (aliceCanMove)
                        break;
                }
                if (!aliceCanMove)
                    return "Bob";
            }
            else {
                boolean bobCanMove = false;
                for (int row = 0; row < rowCount; row++) {
                    for (int col = 0; col < colCount; col++) {
                        if (grid[row][col] == 0 && isValidMove(grid, row, col)) {
                            bobCanMove = true;
                            grid[row][col] = 1;
                            break;
                        }
                    }
                    if (bobCanMove)
                        break;
                }
                if (!bobCanMove)
                    return "Alice";
            }
        }
        return "Bob";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int[][] grid = new int[k][l];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        String winner = predictWinner(grid);
        System.out.println(winner);
    }
}
