import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();

        int[] stones = new int[N];
        for (int i = 0; i < N; i++) {
            stones[i] = i + 1; 
        }
        Arrays.sort(stones);
        int count = 0;
        int index = N - 1;
        while (S > 0) {
            if (stones[index] <= S) {
                count += S / stones[index];
                S %= stones[index];
            }
            index--;
        }
        System.out.println(count);
    }
}
