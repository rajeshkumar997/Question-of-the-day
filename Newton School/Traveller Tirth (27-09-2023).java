import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ratings = new int[n];

        for (int i = 0; i < n; i++) {
            ratings[i] = scanner.nextInt();
        }

        List<Integer> order = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            order.add(i + 1);
        }

        // Sort the places based on their ratings
        Collections.sort(order, (a, b) -> Integer.compare(ratings[a - 1], ratings[b - 1]));

        // Print the order in which Tirth should visit the places
        for (int i = 0; i < n; i++) {
            System.out.print(order.get(i) + " ");
        }
    }
}
