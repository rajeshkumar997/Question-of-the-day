import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] buildingStrengths = new int[n];
        for (int i = 0; i < n; i++) {
            buildingStrengths[i] = scanner.nextInt();
        }

        Arrays.sort(buildingStrengths);

        int maxBuildingsDestroyed = 0;
        int currentStrength = k;

        for (int i = 0; i < n; i++) {
            if (currentStrength >= buildingStrengths[i]) {
                maxBuildingsDestroyed++;
                currentStrength += buildingStrengths[i];
            } else {
                break; 
            }
        }
        System.out.println(maxBuildingsDestroyed);
    }
}
