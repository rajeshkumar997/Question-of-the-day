import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();

        int count = 0;
        for (int a = 0; a <= s; a++) {
            for (int b = 0; b <= s; b++) {
                for (int c = 0; c <= s; c++) {
                    if (a + b + c <= s && a * b * c <= t) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
