import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            long zero = 0, ones = 0, both = 0;
            for(int i = 0; i<n; i++){
                String s = br.readLine();
                if(s.contains("0"))
                zero++;
                if(s.contains("1"))
                ones++;
                if(s.contains("0")&s.contains("1"))
                both++;
            }
            long ans = zero*(zero-1)/2 + ones*(ones-1)/2 - both*(both-1)/2;
            System.out.println(ans);
        } 
    }
}
