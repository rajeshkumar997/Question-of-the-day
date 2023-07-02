import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int totalCost = N * X;
        String result = isAncientNumber(totalCost) ? "yes" : "no";
        System.out.println(result);
    }

    public static boolean isAncientNumber(int num) {
        String numStr = String.valueOf(num);
        return numStr.length() == 5 && !numStr.startsWith("0");
    }
}
