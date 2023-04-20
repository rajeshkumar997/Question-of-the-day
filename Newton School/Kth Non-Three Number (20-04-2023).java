import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int count = 0;
        int i = 1;
        while (count < k) {
            if (i % 3 != 0 && i % 10 != 3) {
                count++;
            }
            i++;
        }
        System.out.println(i - 1);
    }
}
