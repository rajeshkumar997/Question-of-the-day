import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        String s = new Scanner(System.in).nextLine();
        int[] arr = new int[4];
        for (int i = 0; i < s.length(); i++)
        if (s.charAt(i) != '+')
            arr[s.charAt(i) - '0']++;
        s = "";
        for (int k = 1; k <= 3; k++) {
            while (arr[k] > 0) {
                s += k + "+";
                arr[k]--;
            }
        }
        if (s.length() > 1)
            System.out.println(s.substring(0, s.length() - 1));
        else
            System.out.println(s);
    }
}
