import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] army1 = new int[n1];
        int[] army2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            army1[i] = sc.nextInt(); 
        }
        for (int i = 0; i < n2; i++) {
            army2[i] = sc.nextInt(); 
        }
        int leaders1 = 1; 
        int leaders2 = 1; 
        int max1 = army1[0]; 
        int max2 = army2[0]; 
        for (int i = 1; i < n1; i++) {
            if (army1[i] >= max1) {
                max1 = army1[i];
                leaders1++;
            }
        }
        for (int i = 1; i < n2; i++) {
            if (army2[i] >= max2) {
                max2 = army2[i];
                leaders2++;
            }
        }
        if (leaders1 > leaders2) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
