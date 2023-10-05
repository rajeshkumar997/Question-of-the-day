import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();

        int remainder = Y % 4;
        int nextEventYear;

        if (remainder == 2) {
            nextEventYear = Y;
        } else if (remainder < 2) {
            nextEventYear = Y + (2 - remainder);
        } else {
            nextEventYear = Y + (4 - remainder + 2);
        }
        System.out.println(nextEventYear);
    }
}
