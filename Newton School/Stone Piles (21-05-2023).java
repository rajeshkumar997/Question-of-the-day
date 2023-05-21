import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        boolean flag = true;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
            if (arr.get(i) == 1 && flag && i != n - 1)
                count++;
            else
                flag = false;
        }
        System.out.println((count % 2 != 1) ? "First" : "Second");
    }
}
