import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] parents = new int[N];
        for (int i = 1; i < N; i++) {
            parents[i] = sc.nextInt();
        }

        int gen = calc(N, parents);
        System.out.println(gen);
    }

    private static int calc(int N, int[] parents) {
        int generations = 0;
        int curr = N;

        while (curr > 1) {
            curr = parents[curr - 1]; 
            generations++;
        }
        return generations;
    }
}
