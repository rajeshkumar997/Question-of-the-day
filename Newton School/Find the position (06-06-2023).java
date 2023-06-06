import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int posX = -1;
        int posY = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int sum = getSum(matrix, i, j);
                if (sum > maxSum) {
                    maxSum = sum;
                    posX = i + 1;
                    posY = j + 1;
                }
            }
        }
        System.out.println(posX + " " + posY);
    }

    private static int getSum(int[][] matrix, int row, int col) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i != row) {
                sum += matrix[i][col];
            }
        }
        for (int j = 0; j < matrix[0].length; j++) {
            if (j != col) {
                sum += matrix[row][j];
            }
        }
        return sum;
    }
}
