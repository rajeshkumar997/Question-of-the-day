import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] entryTimes = new int[n];
        int[] exitTimes = new int[n];
        for (int i = 0; i < n; i++) {
            entryTimes[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            exitTimes[i] = sc.nextInt();
        }

        int minCapacity = calculateMinCapacity(n, entryTimes, exitTimes);
        System.out.println(minCapacity);
    }

    public static int calculateMinCapacity(int n, int[] entryTimes, int[] exitTimes) {
        int minCapacity = 0;
        int entryIndex = 0;
        int exitIndex = 0;
        int currentCapacity = 0;

        Arrays.sort(entryTimes);
        Arrays.sort(exitTimes);

        while (entryIndex < n) {
            if (entryTimes[entryIndex] <= exitTimes[exitIndex]) {
                currentCapacity++;
                entryIndex++;
                minCapacity = Math.max(minCapacity, currentCapacity);
            } else {
                currentCapacity--;
                exitIndex++;
            }
        }
        return minCapacity;
    }
}
