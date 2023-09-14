import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        int candies = X; 
        int wrappers = X;
        
        while (wrappers >= 3) {
            int newCandies = wrappers / 3;
            candies += newCandies;
            wrappers = newCandies + (wrappers % 3);
        }
        System.out.println(candies);
    }
}
