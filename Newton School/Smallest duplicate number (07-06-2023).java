import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int smallestDuplicate = findSmallestDuplicate(arr);
        System.out.println(smallestDuplicate);
    }

    private static int findSmallestDuplicate(int[] arr) {
        Arrays.sort(arr);
        int smallestDuplicate = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                smallestDuplicate = arr[i];
                break;
            }
        }
        return smallestDuplicate;
    }
}
