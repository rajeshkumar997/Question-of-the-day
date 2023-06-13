import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                evenList.add(num); 
            } else {
                oddList.add(num);   
            }
        }
        evenList.addAll(oddList);
        for (int i = 0; i < N; i++) {
            System.out.print(evenList.get(i) + " ");
        }
    }
}
