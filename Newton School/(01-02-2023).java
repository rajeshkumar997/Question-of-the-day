import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        String s = sc.next();
        sc.close();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < (r - l + 1) / 2; i++) {
            char temp = sb.charAt(l - 1 + i);
            sb.setCharAt(l - 1 + i, sb.charAt(r - 1 - i));
            sb.setCharAt(r - 1 - i, temp);
        }
        System.out.println(sb.toString());
    }
}
