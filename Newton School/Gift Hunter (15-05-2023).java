import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        String path = sc.next();
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if (ch == 'L') {
                x--;
            } else if (ch == 'R') {
                x++;
            } else if (ch == 'D') {
                y--;
            } else if (ch == 'U') {
                y++;
            }
            if (x == k && y == l) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
