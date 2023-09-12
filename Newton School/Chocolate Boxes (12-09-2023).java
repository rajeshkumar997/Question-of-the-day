import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int W = scanner.nextInt();  
        int[] chocolates = new int[n];
        for (int i = 0; i < n; i++) {
            chocolates[i] = scanner.nextInt(); 
        }
        
        Arrays.sort(chocolates);
        
        int left = 0; 
        int right = n - 1; 
        int boxes = 0; 
        
        while (left <= right) {
            if (chocolates[right] + chocolates[left] <= W) {
                left++;
            }
            right--; 
            boxes++;
        }
        System.out.println(boxes);
    }
}
