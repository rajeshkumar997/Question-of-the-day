import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Set < Integer > set = new HashSet <> ();
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                set.add(-arr[i]);
            }
            else {
                set.add(arr[i]);
            }
        }
        System.out.println(set.size());
    }
}
