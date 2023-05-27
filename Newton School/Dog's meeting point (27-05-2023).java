import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();

        int time = getTimeToMeet(p, q, r, s);
        System.out.println(time);
    }

    private static int getTimeToMeet(int p, int q, int r, int s) {
        int distance = q - p;
        if (distance % (s + r) != 0) {
            return -1; 
        }
        int timeToMeet = distance / (s + r);
        return timeToMeet;
    }
}
