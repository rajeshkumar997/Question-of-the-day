import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
       Scanner sc = new Scanner(System.in);
        String str = "";
        while (sc.hasNextLine()) {
            str += sc.nextLine() + "\n";
        }
        String[] arr = str.split("\n");
        testCase(arr);
    }
    
    private static void testCase(String[] input) {
        String[] tokens = input[0].split(" ");
        int left = Integer.parseInt(tokens[0]);
        int right = Integer.parseInt(tokens[1]);
        System.out.println((right < left * 2 ? right - left : (right - 1) / 2));
    }
}
