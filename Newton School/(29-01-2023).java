import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int lastIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                lastIndex = i + 1;
            }
        }
        System.out.println(lastIndex);
    }
}
