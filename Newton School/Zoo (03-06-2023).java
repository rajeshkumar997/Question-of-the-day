import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int countZ = 0;
        int countO = 0;
        for (char c : word.toCharArray()) {
            if (c == 'z') {
                countZ++;
            } else if (c == 'o') {
                countO++;
            }
        }
        if (countZ * 2 == countO) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
