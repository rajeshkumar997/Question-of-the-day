import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Set<Integer> evenNumbers = new HashSet<>();
        Random random = new Random();
        while (evenNumbers.size() < 5) {
            int num = random.nextInt(M - N) + N;
            if (num % 2 == 0 && num != N && num != M) {
                evenNumbers.add(num);
            }
        }
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
    }
}
