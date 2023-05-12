import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int count = 0;
        while (n.length() > 1) {
            int sum = 0;
            for (int i = 0; i < n.length(); i++) {
                sum += n.charAt(i) - '0';
            }
            n = Integer.toString(sum);
            count++;
        }
        System.out.println(count);
    }
}
