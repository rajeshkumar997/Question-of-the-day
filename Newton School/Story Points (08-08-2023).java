import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int[][] storyPoints = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                storyPoints[i][j] = sc.nextInt();
            }
        }

        int[] totalPoints = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                totalPoints[i] += storyPoints[i][j];
            }
        }
        int maxPoints = -1;
        String[] names = {"Himanshu", "Gorakh", "Vikas", "Hritvik"};
        String winner = "";
        
        for (int i = 0; i < 4; i++) {
            if (totalPoints[i] > maxPoints) {
                maxPoints = totalPoints[i];
                winner = names[i];
            }
        }
        System.out.println(winner);
    }
}
