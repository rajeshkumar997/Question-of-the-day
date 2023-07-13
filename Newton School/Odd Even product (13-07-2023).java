import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int oddsum = 0;
        int evensum = 0;
        while(n > 0){
            int digit = n % 10;
            if(digit % 2 == 0){
                evensum += digit;
            } 
            else{
                oddsum += digit;
            }
            n /= 10;
        }
        int product = oddsum*evensum;
        System.out.print(product);
    }
}
