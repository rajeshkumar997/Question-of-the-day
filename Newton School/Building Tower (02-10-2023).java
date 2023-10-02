import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        boolean[] vis = new boolean[n+1];
        int max = n;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<n; i++){
            vis[arr[i]] = true;
            ans = new StringBuilder();
            if(vis[max]){
                while(vis[max]){
                    ans.append(max+" ");
                    max--;
                }
            }
            System.out.println(ans);
        }
    }
}
