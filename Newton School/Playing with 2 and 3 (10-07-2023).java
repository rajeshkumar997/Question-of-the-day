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

        int steps = convertNumbers(N, M);
        System.out.println(steps);
    }

    private static int convertNumbers(int N, int M) {
        if (M % N != 0) {
            return -1;
        }

        int steps = 0;
        int division = M / N;
        while (division > 1 && division % 2 == 0) {
            division /= 2;
            steps++;
        }
        while (division > 1 && division % 3 == 0) {
            division /= 3;
            steps++;
        }
        if (division != 1) {
            return -1;
        }
        return steps;
    }
}
