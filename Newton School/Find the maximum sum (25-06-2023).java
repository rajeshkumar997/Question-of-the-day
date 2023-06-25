import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.println(sc.nextLong());
            return;
        }
        long[] arr = new long[n];
        long ans = 0, base = 1;
        int oddInd = -1, evenInd = -1;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
            while(arr[i]%2 == 0){
                arr[i]/= 2;
                base *= 2;
            }
            ans += arr[i];
        }
        Arrays.sort(arr);
        ans -= arr[n-1];
        arr[n-1] *= base;
        ans += arr[n-1];
        System.out.println(ans);
    }
}
