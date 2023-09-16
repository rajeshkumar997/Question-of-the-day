import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dishCount = new int[1000001];
        int mostCravedDishID = -1;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int dishID = sc.nextInt();
            dishCount[dishID]++;

            if (dishCount[dishID] > maxCount) {
                maxCount = dishCount[dishID];
                mostCravedDishID = dishID;
            }
        }
        System.out.println(mostCravedDishID);
    }
}
