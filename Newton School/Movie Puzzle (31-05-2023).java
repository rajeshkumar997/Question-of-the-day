import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) throws IOException{
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[2];
        int[] in = new int[n];
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            in[i] = Integer.parseInt(s[0]);
            out[i] = Integer.parseInt(s[1]);
        }
        Arrays.sort(in);
        Arrays.sort(out);

        int max = 1, cur = 1;
        int i = 1, j = 0;
        while (i < n && j < n) {
            if (in[i] <= out[j]) {
                cur++;
                max = Math.max(cur, max);
                i++;
            } else {
                cur--;
                j++;
            }
        }
        System.out.println(max);
    }
}
