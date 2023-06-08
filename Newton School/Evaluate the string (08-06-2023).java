import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char xChar = str.charAt(0);
        char yChar = str.charAt(2);

        int x = Character.getNumericValue(xChar);
        int y = Character.getNumericValue(yChar);
        int result = x * y;
        System.out.println(result);
    }
}
