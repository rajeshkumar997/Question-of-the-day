import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = s.nextInt();
        int result = Integer.MAX_VALUE;
        for(int i=0;i< 1<<n-1 ;i++){
            int xorValue = 0;
            int orValue = arr[0];
            for(int j=0;j<n-1;j++){
                if((i>>j & 1) != 0){
                    xorValue ^= orValue;
                    orValue = 0;
                }
                orValue |= arr[j+1];
            }
            xorValue ^= orValue;
            result = Math.min(result,xorValue);
        }
        System.out.println(result);
    }
}
