import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int lastIndex = -1;
        int secondLastIndex = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                secondLastIndex = lastIndex;
                lastIndex = i;
            }
        }
        System.out.print(secondLastIndex);
    }
}
