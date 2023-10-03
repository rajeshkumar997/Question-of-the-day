import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
       Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        
        int ans = Integer.MAX_VALUE;
        String reversedN = new StringBuilder(n).reverse().toString();
        
        ans = Math.min(ans, getMinSteps("00", reversedN));
        ans = Math.min(ans, getMinSteps("52", reversedN));
        ans = Math.min(ans, getMinSteps("05", reversedN));
        ans = Math.min(ans, getMinSteps("57", reversedN));
        
        System.out.println(ans);
    }
    
    public static int getMinSteps(String pair, String reversedN) {
        int firstIdx = reversedN.indexOf(pair.charAt(0));
        if (firstIdx == -1)
            return Integer.MAX_VALUE;
        
        int secondIdx = reversedN.indexOf(pair.charAt(1), firstIdx + 1);
        if (secondIdx == -1)
            return Integer.MAX_VALUE;
        
        return secondIdx - 1;
    }
}
