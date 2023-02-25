import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int[] cards = new int[5];
        for (int i = 0; i < 5; i++) {
            cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);
        
        if ((cards[0] == cards[1] && cards[1] == cards[2] && cards[3] == cards[4]) ||
            (cards[0] == cards[1] && cards[2] == cards[3] && cards[3] == cards[4])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
